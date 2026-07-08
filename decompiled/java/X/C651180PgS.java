package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder.DynamicViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;

/* JADX INFO: renamed from: X.0PgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651180PgS extends AbstractC651200PgU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnumC645610PTz enumC645610PTz;
        View view;
        SearchFragment searchFragment;
        C645130PSd c645130PSd;
        InterfaceC651190PgT interfaceC651190PgT = (InterfaceC651190PgT) xBaseParamModel;
        String scene = interfaceC651190PgT.getScene();
        int iHashCode = scene.hashCode();
        String containerID = null;
        if (iHashCode != -309474065) {
            if (iHashCode != 3322092) {
                if (iHashCode == 112202875 && scene.equals("video")) {
                    enumC645610PTz = EnumC645610PTz.VIDEO_IN_PRODUCT_CARD;
                } else {
                    return;
                }
            } else if (!scene.equals("live")) {
                return;
            } else {
                enumC645610PTz = EnumC645610PTz.LIVE_IN_PRODUCT_CARD;
            }
        } else if (!scene.equals("product")) {
            return;
        } else {
            enumC645610PTz = EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD;
        }
        if (enumC645610PTz != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            } else {
                view = null;
            }
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if ((fragmentLIZ instanceof SearchJediMixFeedFragment) && (searchFragment = (SearchFragment) fragmentLIZ) != null) {
                AbstractC683590Qrd abstractC683590QrdNS = searchFragment.NS();
                if ((abstractC683590QrdNS instanceof C645130PSd) && (c645130PSd = (C645130PSd) abstractC683590QrdNS) != null) {
                    final int iLJJJIL = c645130PSd.LJJJIL();
                    c645130PSd.LLLLIIL(iLJJJIL, 0, new C092O() { // from class: X.0PU9
                        @Override // X.C092O
                        public final void accept(Object obj) {
                            DynamicViewHolder dynamicViewHolder;
                            ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN;
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
                            if ((viewHolder instanceof ViewOnAttachStateChangeListenerC648030PbN) && (viewOnAttachStateChangeListenerC648030PbN = (ViewOnAttachStateChangeListenerC648030PbN) viewHolder) != null) {
                                int i = iLJJJIL;
                                C0PU6 c0pu6 = viewOnAttachStateChangeListenerC648030PbN.LLJJJJLIIL;
                                if (c0pu6 != null) {
                                    c0pu6.LJI(i);
                                    return;
                                }
                                return;
                            }
                            if (!(viewHolder instanceof DynamicViewHolder) || (dynamicViewHolder = (DynamicViewHolder) viewHolder) == null) {
                                return;
                            }
                            int i2 = iLJJJIL;
                            C0PU6 c0pu62 = dynamicViewHolder.LLILZ.LLILLJJLI;
                            if (c0pu62 == null) {
                                return;
                            }
                            c0pu62.LJI(i2);
                        }
                    });
                }
            }
            C1202104n5.LIZ().LJJIII(enumC645610PTz, interfaceC651190PgT.getQuery(), interfaceC651190PgT.getSrcId(), interfaceC651190PgT.getCardIndex().intValue(), interfaceC651190PgT.getProductId(), interfaceC651190PgT.getCtxProductIds(), interfaceC651190PgT.getUserAction());
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC651230PgX.class, containerID), "");
        }
    }
}
