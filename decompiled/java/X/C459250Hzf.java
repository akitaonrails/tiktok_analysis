package X;

import Y.ACListenerS110S0200000_6;
import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459250Hzf extends Scene implements InterfaceC379610EuV {
    public final C1DRG LLJI;
    public final VideoPublishEditModel LLJIJIL;
    public final InterfaceC1461350o8D LLJILJIL;
    public final InterfaceC459260Hzg LLJILJILJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 608));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 609));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(132));

    public final void LLLIIIIL() {
        if (!this.LLJJIII) {
            C786410Ut5.LJLLLLLL(0, this.mView);
            C786410Ut5.T4(this.mView, 1.0f);
            this.LLJILJILJ.Wu1("EditStorySAStickerTrayComponent");
        }
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
        if (iSocialAvatarDebugService != null) {
            iSocialAvatarDebugService.LJFF();
        }
        if (Intrinsics.LJFF(this.LLJIJIL.getEnterFrom(), "post_social_avatar_anchor_page") || this.LLJJI) {
            return;
        }
        C0HYP.LIZ.getClass();
        ArrayList arrayList = (ArrayList) C13LQ.LJLI(C0HYP.LJ().getStringArray("story_sticker_tray_show_timestamp", new String[0]));
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        C0HYP.LJ().storeStringArray("story_sticker_tray_show_timestamp", (String[]) arrayList.toArray(new String[0]));
        this.LLJJI = true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public final void LLLII(boolean z) {
        if (this.mView.getVisibility() == 0) {
            C21647019ng c21647019ng = new C21647019ng(this.mView.getContext(), this.mView, new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.25f), new C1342130l1v(0.2f), new C1342130l1v(0.25f), new C1342130l1v(1.0f), 30L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)))), false);
            c21647019ng.LIZJ("alpha", new C462950IDl(this, 1));
            c21647019ng.LJI(true);
        }
        this.LLJILJILJ.bN("EditStorySAStickerTrayComponent");
        if (z) {
            this.LLJJIII = true;
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C0HK0 c0hk0;
        List<StickerItem> stickers;
        super.onViewCreated(view, bundle);
        ((RecyclerView) this.LLJILLL.getValue()).setLayoutManager(new LinearLayoutManager(this.mView.getContext(), 0, false));
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        IMSocialAvatarStatus value = c454640HsE.LIZIZ().getImSocialAvatarService().LJJLI(null, false).getValue();
        if ((value instanceof C0HK0) && (c0hk0 = (C0HK0) value) != null && (stickers = c0hk0.getStickers()) != null) {
            List<StickerItem> listLJIIJ = c454640HsE.LIZIZ().getImSocialAvatarService().LJIIJ(stickers, EnumC454380Hro.STICKER_PANEL);
            final ArrayList arrayList = new ArrayList();
            Iterator<StickerItem> it2 = listLJIIJ.iterator();
            while (it2.hasNext()) {
                SocialAvatarStickerStruct socialAvatarStickerStructLIZ = C455350HtN.LIZ(it2.next());
                if (socialAvatarStickerStructLIZ != null) {
                    arrayList.add(new C459240Hze(socialAvatarStickerStructLIZ));
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                List<String> midResolutionUrl = ((C459240Hze) it3.next()).LL.getMidResolutionUrl();
                if (midResolutionUrl != null) {
                    C1331660kl2.LJIIJ(new C03IT(midResolutionUrl)).LJJIII();
                }
            }
            RecyclerView recyclerView = (RecyclerView) this.LLJILLL.getValue();
            final C459230Hzd c459230Hzd = C459230Hzd.LIZ;
            final AwS620S0100000_6 awS620S0100000_6 = new AwS620S0100000_6(this, 66);
            recyclerView.setAdapter(new AbstractC2172971A2l<C459240Hze, C459220Hzc>(arrayList, c459230Hzd, awS620S0100000_6) { // from class: X.0Hzb
                public final List<C459240Hze> LLILLJJLI;
                public final Function2<Effect, String, Unit> LLILLL;

                @Override // X.AbstractC2172971A2l, X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LLILLJJLI.size();
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    String str;
                    C459220Hzc c459220Hzc = (C459220Hzc) viewHolder;
                    C459240Hze c459240Hze = (C459240Hze) ListProtector.get(this.LLILLJJLI, i);
                    c459220Hzc.getClass();
                    List<String> midResolutionUrl2 = c459240Hze.LL.getMidResolutionUrl();
                    if (midResolutionUrl2 == null) {
                        midResolutionUrl2 = C13BV.INSTANCE;
                    }
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(midResolutionUrl2));
                    c1331670kl3LJIIJ.LJJ((SmartImageView) c459220Hzc.LLILLJJLI.getValue());
                    C786410Ut5.h3(c1331670kl3LJIIJ);
                    C786410Ut5.I7(new ACListenerS110S0200000_6(c459220Hzc, c459240Hze, 15), c459220Hzc.itemView);
                    View view2 = (View) c459220Hzc.LLILLJJLI.getValue();
                    List<String> expression = c459240Hze.LL.getExpression();
                    if (expression != null) {
                        str = (String) C13LP.LJJJLL(expression);
                    } else {
                        str = null;
                    }
                    view2.setContentDescription(str);
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    C459220Hzc c459220Hzc = new C459220Hzc(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d8y, viewGroup, false), this.LLILLL);
                    try {
                        View view2 = c459220Hzc.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c459220Hzc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c459220Hzc.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(C459220Hzc.class.getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c459220Hzc.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c459220Hzc.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = C459220Hzc.class.getName();
                    return c459220Hzc;
                }

                {
                    super(c459230Hzd);
                    this.LLILLJJLI = arrayList;
                    this.LLILLL = awS620S0100000_6;
                }
            });
            LLLIIIIL();
            C0HWW.LIZ.getClass();
            C0HWW.LJJII("show");
            if (C426750GoL.LIZLLL(this.mView.getContext())) {
                HandlerHook.viewPost((View) this.LLJILLL.getValue(), new ARunnableS106S0100000_6(this, 111));
            }
        }
        ((C197039127h) this.LLJJ.getValue()).LJJLI(true);
        ((C197039127h) this.LLJJ.getValue()).setButtonStartIcon(Integer.valueOf(R.raw.icon_x_mark));
        C786410Ut5.U8((C197039127h) this.LLJJ.getValue(), new ACListenerS141S0100000_6(this, 57));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d8x, viewGroup, false);
    }

    public C459250Hzf(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel, InterfaceC1461350o8D interfaceC1461350o8D, InterfaceC459260Hzg interfaceC459260Hzg) {
        this.LLJI = c1drg;
        this.LLJIJIL = videoPublishEditModel;
        this.LLJILJIL = interfaceC1461350o8D;
        this.LLJILJILJ = interfaceC459260Hzg;
    }
}
