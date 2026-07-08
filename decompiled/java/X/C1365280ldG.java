package X;

import Y.AObserverS224S0100000_21;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.helper.ShareStateHelper;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ldG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365280ldG extends C1365470ldZ implements InterfaceC1356390lOv {
    public final Activity LLJJLIIIJLLLLLLLZ;
    public final LifecycleOwner LLJL;
    public final Aweme LLJLIL;
    public final InterfaceC1362600lYw LLJLILLLLZIIL;
    public final InterfaceC1356400lOw LLJLL;
    public final InterfaceC1356370lOt LLJLLIL;

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    @Override // X.AbstractC1375780luC, X.InterfaceC1238780iLE
    public final void onDismiss() {
        if (isShowing() && !this.LLJI) {
            try {
                Activity activity = this.LLILZLL;
                if (activity != null && !activity.isFinishing()) {
                    C1378330lyJ c1378330lyJ = this.LLJ;
                    if (c1378330lyJ != null) {
                        c1378330lyJ.LIZ(0.0f, true);
                    }
                    dismiss();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((HashMap) C707370Rot.LIZ.LIZ).remove("key_need_hide_pop_window");
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        boolean z;
        String uid;
        if (list.size() > 3) {
            list = list.subList(0, 3);
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && list.size() == 1) {
            BaseContact baseContact = (BaseContact) ListProtector.get(list, 0);
            if (baseContact instanceof IMUser) {
                String uid2 = baseContact.getUid();
                User userLIZLLL = C461720I8s.LIZLLL();
                if (userLIZLLL != null) {
                    uid = userLIZLLL.getUid();
                } else {
                    uid = null;
                }
                u.LJIJI(uid2, uid, false);
            }
        }
        if (!C1336205Ku.LIZJ().LIZJ()) {
            this.LLJLL.LLJILJILJ(null, list);
        }
        C786410Ut5.LJLLLLLL(0, this.LL);
    }

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
        C786410Ut5.LJLLLLLL(0, this.LL);
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean eJ2(IMContact iMContact, boolean z) {
        C1363190lZt c1363190lZt;
        String str;
        String str2;
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLJLILLLLZIIL;
        if (interfaceC1362600lYw != null && !interfaceC1362600lYw.LJIIIIZZ((SharePackage) this.LLJJIII.LJIJJ)) {
            return false;
        }
        final List<? extends IMContact> listLJIILJJIL = C1697810uHb.LJIILJJIL(iMContact);
        this.LLJJIII.LJIJJ.extras.putBoolean("is_ad", this.LLJLIL.isAd());
        this.LLJJIII.LJIJJ.extras.putInt("rank_num", this.LLJLLIL.LJI(iMContact));
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LJJII((SharePackage) this.LLJJIII.LJIJJ, iMContact, "", System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), C0I0B.LJFF.LIZIZ());
        SharePackage sharePackage = (SharePackage) this.LLJJIII.LJIJJ;
        InterfaceC1362600lYw interfaceC1362600lYw2 = this.LLJLILLLLZIIL;
        if (interfaceC1362600lYw2 != null) {
            interfaceC1362600lYw2.LJFF(sharePackage);
        }
        C1235930iGd.LIZ((SharePackage) this.LLJJIII.LJIJJ, listLJIILJJIL);
        BaseSharePackage baseSharePackage = this.LLJJIII.LJIJJ;
        baseSharePackage.extras.putInt("is_create_group_chat", 0);
        if (iMContact instanceof IMUser) {
            baseSharePackage.extras.putInt("friends_shared_cnt", 1);
        } else if (iMContact instanceof IMConversation) {
            baseSharePackage.extras.putInt("friends_shared_cnt", ((IMConversation) iMContact).getConversationMemberCount());
        }
        C786410Ut5.LJJJI("enter_method", "publish_then_share_icon", this.LLJJIII.LJIJJ.extras);
        this.LLJJIII.LJIJJ.extras.putBoolean("sending_message_has_animation", false);
        if ((iMContact instanceof C1363190lZt) && (c1363190lZt = (C1363190lZt) iMContact) != null) {
            C214824195i c214824195i = C214824195i.LIZIZ;
            LifecycleOwner lifecycleOwner = this.LLJL;
            C1362500lYm bbDetailInfo = c1363190lZt.getBbDetailInfo();
            String str3 = "";
            if (bbDetailInfo == null || (str = bbDetailInfo.LIZ) == null) {
                str = "";
            }
            C1362500lYm bbDetailInfo2 = c1363190lZt.getBbDetailInfo();
            if (bbDetailInfo2 != null && (str2 = bbDetailInfo2.LIZIZ) != null) {
                str3 = str2;
            }
            c214824195i.LIZIZ(lifecycleOwner, str, str3, this.LLJJIII.LJIJJ, 0, true, null, 0, "video_post_page", null, this.LLJLIL);
        } else {
            C1365220ldA c1365220ldA = C1365220ldA.LIZ;
            final SharePackage sharePackage2 = (SharePackage) this.LLJJIII.LJIJJ;
            final InterfaceC1362600lYw interfaceC1362600lYw3 = this.LLJLILLLLZIIL;
            final EnumC1478905qd enumC1478905qd = EnumC1478905qd.RECENT_SHARED;
            c1365220ldA.getClass();
            C1370970lmR.LIZ().LIZIZ().LJJIZ(listLJIILJJIL);
            final String strLJII = ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LJII();
            SendMessageTemplateTask sendMessageTemplateTask = sharePackage2.sendMessageTemplateTask;
            C786410Ut5.LJJJI("source", "share", sharePackage2.extras);
            C1365220ldA.LJIIL(sharePackage2, listLJIILJJIL);
            Map<String, String> mapLJFF = C1365220ldA.LJFF(sharePackage2);
            if (sendMessageTemplateTask != null) {
                C1365220ldA.LJIIJJI(sendMessageTemplateTask, sharePackage2, mapLJFF);
                C1336205Ku.LIZ(false).getSendMessageTemplateService().LIZ(listLJIILJJIL, sendMessageTemplateTask, null, mapLJFF, null, null, new C1365180ld6(interfaceC1362600lYw3, sharePackage2, null, listLJIILJJIL), false, null);
                C1365220ldA.LJIIIZ(sharePackage2, sendMessageTemplateTask.sendMessageEventParcel, listLJIILJJIL, null);
                ArrayList<String> arrayList = C805520Vio.LIZ;
                C805530Vip.LIZ().LIZLLL("recent share", "default", listLJIILJJIL);
            } else {
                if (interfaceC1362600lYw3 != null) {
                    interfaceC1362600lYw3.LJFF(sharePackage2);
                }
                C1365330ldL.LIZ.LJI(listLJIILJJIL, null, sharePackage2, null, null, C1365220ldA.LJFF(sharePackage2), null, strLJII, false, new InterfaceC1361990lXx() { // from class: X.0ld8
                    public final /* synthetic */ String LJ = null;

                    @Override // X.InterfaceC1361990lXx
                    public final void LIZ() {
                        ShareStateHelper.LIZJ(sharePackage2, strLJII, listLJIILJJIL);
                        InterfaceC1362600lYw interfaceC1362600lYw4 = interfaceC1362600lYw3;
                        if (interfaceC1362600lYw4 != null) {
                            SharePackage sharePackage3 = sharePackage2;
                            listLJIILJJIL.size();
                            interfaceC1362600lYw4.LJIIL(sharePackage3);
                        }
                        InterfaceC1362600lYw interfaceC1362600lYw5 = interfaceC1362600lYw3;
                        if (interfaceC1362600lYw5 != null) {
                            interfaceC1362600lYw5.LIZ(sharePackage2);
                        }
                        IInternalShareApi.LIZ.getClass();
                        C1370970lmR.LIZ().LIZJ().LJIILLIIL(sharePackage2, this.LJ, new ArrayList(listLJIILJJIL), System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
                        if (enumC1478905qd == EnumC1478905qd.RECENT_SHARED) {
                            ArrayList<String> arrayList2 = C805520Vio.LIZ;
                            C805530Vip.LIZ().LIZLLL("recent share", "default", listLJIILJJIL);
                        } else {
                            ArrayList<String> arrayList3 = C805520Vio.LIZ;
                            C805530Vip.LIZ().LIZLLL("recent share", "default", listLJIILJJIL);
                        }
                    }

                    @Override // X.InterfaceC1361990lXx
                    public final void LIZIZ(HashMap<String, String> map) {
                        C1365220ldA c1365220ldA2 = C1365220ldA.LIZ;
                        SharePackage sharePackage3 = sharePackage2;
                        String str4 = this.LJ;
                        c1365220ldA2.getClass();
                        C1365220ldA.LIZJ(sharePackage3, map, str4);
                        InterfaceC1362600lYw interfaceC1362600lYw4 = interfaceC1362600lYw3;
                        if (interfaceC1362600lYw4 != null) {
                            interfaceC1362600lYw4.LIZIZ(map);
                        }
                    }
                }, null, null);
            }
        }
        onDismiss();
        return false;
    }

    public C1365280ldG(C19EG c19eg, LifecycleOwner lifecycleOwner, C1371590lnR c1371590lnR, String[] strArr, Aweme aweme, C460910I5p c460910I5p) {
        SharePackage sharePackage;
        CharSequence text;
        AbstractC21673619ry abstractC21673619ry;
        CharSequence text2;
        Bundle bundle;
        int iIntValue;
        super(c19eg, c1371590lnR, strArr, aweme);
        this.LLJJLIIIJLLLLLLLZ = c19eg;
        this.LLJL = lifecycleOwner;
        this.LLJLIL = aweme;
        this.LLJLILLLLZIIL = c460910I5p;
        BaseSharePackage baseSharePackage = c1371590lnR.LJIJJ;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, c19eg);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            bundle.putInt("key_sheet_background_color", iIntValue);
        }
        IInternalShareApi.LIZ.getClass();
        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
        BaseSharePackage baseSharePackage2 = c1371590lnR.LJIJJ;
        if (baseSharePackage2 instanceof SharePackage) {
            sharePackage = (SharePackage) baseSharePackage2;
        } else {
            sharePackage = null;
        }
        Pair pairLJJJI = interfaceC1364710lcLLIZIZ.LJJJI(sharePackage, this, lifecycleOwner, c19eg, this, c460910I5p);
        InterfaceC1356400lOw interfaceC1356400lOw = (InterfaceC1356400lOw) pairLJJJI.getFirst();
        InterfaceC1356370lOt interfaceC1356370lOt = (InterfaceC1356370lOt) pairLJJJI.getSecond();
        this.LLJLL = interfaceC1356400lOw;
        this.LLJLLIL = interfaceC1356370lOt;
        RemoteImageView remoteImageView = this.LLILLJJLI;
        if (remoteImageView != null) {
            C786410Ut5.l(remoteImageView, 8);
        }
        C786410Ut5.LJLLLLLL(8, this.LL);
        C786410Ut5.LJJJI("enter_method", "publish_then_share", this.LLJJIII.LJIJJ.extras);
        C786410Ut5.LJJJI("enter_from", "publish_share_panel", this.LLJJIII.LJIJJ.extras);
        if (C1375340ltU.LIZJ(aweme)) {
            TuxTextView tuxTextView = this.LLILLL;
            if (C1365290ldH.LIZ()) {
                text2 = LJJIIJZLJL(aweme);
            } else {
                text2 = this.LLILZLL.getResources().getText(2131847859);
            }
            tuxTextView.setText(text2);
        } else {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (C1365290ldH.LIZ()) {
                text = LJJIIZ(aweme);
            } else {
                text = this.LLILZLL.getResources().getText(2131838935);
            }
            tuxTextView2.setText(text);
        }
        int i = this.LLJJIII.LJIJJ.extras.getInt("custom_share_panel_title_res_id", 0);
        if (i != 0) {
            try {
                this.LLILLL.setText(this.LLILZLL.getResources().getText(i));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C786410Ut5.LJJJI("enter_from", "publish_share_panel", this.LLJJIII.LJIJJ.extras);
        int dimensionPixelOffset = this.LLJJLIIIJLLLLLLLZ.getResources().getDimensionPixelOffset(R.dimen.agc);
        C426750GoL.LJIIIZ(this.LLJILLL, Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), false, 16);
        this.LLJILLL.setBackground(C800330VaR.LIZIZ(this.LLJJLIIIJLLLLLLLZ, R.drawable.d7f));
        C426750GoL.LJIIL(this.LLJILLL, 0, Integer.valueOf(this.LLJJLIIIJLLLLLLLZ.getResources().getDimensionPixelOffset(R.dimen.ag1)), 0, Integer.valueOf(this.LLJJLIIIJLLLLLLLZ.getResources().getDimensionPixelOffset(R.dimen.agb)), 16);
        C426750GoL.LJIIL(this.LLILZ, 0, 0, 0, 0, 16);
        C426750GoL.LJIIIZ(this.LLILLL, Integer.valueOf(this.LLJJLIIIJLLLLLLLZ.getResources().getDimensionPixelOffset(R.dimen.ag9)), 0, 0, 0, false, 16);
        this.LLJLL.LLJJIJIIJIL(this.LLJJIII.LIZ);
        this.LLJLLIL.refresh();
        RecyclerView recyclerView = this.LLJJJJLIIL;
        if (recyclerView != null) {
            Object obj = this.LLJLL;
            if ((obj instanceof AbstractC21673619ry) && (abstractC21673619ry = (AbstractC21673619ry) obj) != null) {
                recyclerView.setAdapter(abstractC21673619ry);
            }
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        }
        C707370Rot.LIZ.LIZ("key_need_hide_pop_window").observeForever(new AObserverS224S0100000_21(this, 1));
    }
}
