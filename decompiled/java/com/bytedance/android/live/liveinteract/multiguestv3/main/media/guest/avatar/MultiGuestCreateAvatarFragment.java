package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar;

import X.AbstractC19484711Kz;
import X.AnonymousClass0114;
import X.AnonymousClass0115;
import X.C01NB;
import X.C09AJ;
import X.C09JN;
import X.C0TZ2;
import X.C0TZ3;
import X.C0UO0;
import X.C1117360fBO;
import X.C1143680frq;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1295960jpS;
import X.C12ES;
import X.C1319900kS4;
import X.C1336570ksx;
import X.C14K9;
import X.C1533950q1J;
import X.C1555540qa8;
import X.C16F5;
import X.C16FS;
import X.C1701940uOG;
import X.C19487311Lz;
import X.C20337914i1;
import X.C20441214yg;
import X.C204692157q;
import X.C20515815Po;
import X.C20689515xd;
import X.C20736316Cj;
import X.C21513519Hh;
import X.C2188811AlT;
import X.C410901il;
import X.C423500Gj6;
import X.C473410IhP;
import X.C480460Ism;
import X.C494720Jag;
import X.C494730Jah;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C755620TkW;
import X.C755630TkX;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C823050WQl;
import X.C917520Zz4;
import X.C924600aAU;
import X.C930540aK4;
import X.C935980aSq;
import X.C936030aSv;
import X.C936100aT2;
import X.C936140aT6;
import X.C936150aT7;
import X.C936170aT9;
import X.C936250aTH;
import X.C936280aTK;
import X.C936310aTN;
import X.C936400aTW;
import X.C953780avY;
import X.C956790b0P;
import X.C987100bnI;
import X.C987240bnW;
import X.EnumC935940aSm;
import X.InterfaceC300801Eo;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import X.InterfaceC934710aQn;
import X.InterfaceC936370aTT;
import Y.AAListenerS323S0100000_12;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import Y.AObjectS358S0100000_15;
import Y.ARunnableS20S1100000_15;
import Y.ATListenerS440S0100000_6;
import Y.AcS354S0200000_15;
import Y.AcS496S0100000_15;
import Y.AfS184S0100000_15;
import Y.AfS5S0100100_15;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AvatarOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestOpenPreviewFromAvatarEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.api.IAvatarAPI;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarStylizeReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarStylizeResp;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.AvatarStyle;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestCreateAvatarFragment extends MultiGuestAbstractAvatarFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyI2LCwtZygmLTY4Zy4lKTEtO2EePSk4IAgmLTY4Cj02KTEpCDkyPCQ+Dz0yLygpJzs=";
    public C16FS LL;
    public C16FS LLILLJJLI;
    public C1319900kS4 LLILLL;
    public C20689515xd LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public LiveIconView LLIZ;
    public C20515815Po LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public View LLJIJIL;
    public C1117360fBO LLJILJIL;
    public int LLJILJILJ;
    public final C11NJ LLJILLL = new C11NJ();
    public final HashMap<Long, String> LLJJ = new HashMap<>();
    public String LLJJI = "";
    public String LLJJIII;
    public String LLJJIJI;
    public Long LLJJIJIIJIL;
    public IAvatarBusinessAbility LLJJIJIL;
    public C09AJ<C936150aT7> LLJJJ;
    public C09AJ<C936140aT6> LLJJJIL;
    public C936030aSv LLJJJJ;
    public Long LLJJJJJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void NR() {
        if (this.LLJJJ != null) {
            return;
        }
        C19487311Lz.LIZIZ(C11NZ.LJIJJLI(new C987240bnW(this, 0)).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LLJILLL, new AfS184S0100000_15(this, 56), new AfS184S0100000_15(this, 57), new C987100bnI(this, 9), null, 48);
    }

    public final void UR() {
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIZILJ(2131852812);
        c782110Um9.LJII(2131852810);
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131852811);
        c755620TkW.LIZJ = new AcS496S0100000_15(this, 24);
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131852836);
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0aT5
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gk3);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJ = false;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel;
        super.onDestroy();
        C20441214yg.LIZIZ("MultiGuestCreateAvatarFragment", "onDestroy");
        this.LLJILLL.dispose();
        C936030aSv c936030aSv = this.LLJJJJ;
        if (c936030aSv != null && c936030aSv.LIZIZ == EnumC935940aSm.STATE_FAILED) {
            c936030aSv.LIZ.LIZIZ(null, null);
        }
        int i = this.LLJILJILJ;
        if (i == 1) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.FQ2(AvatarOpenCameraEvent.class);
            }
        } else if (i == 2 && (dataChannel = this.dataChannel) != null) {
            dataChannel.LC0(MultiGuestOpenPreviewFromAvatarEvent.class, "avatar_back");
        }
        String str = C936280aTK.LIZIZ;
        C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.01ta
            public static void LIZ() {
                File[] fileArrListFiles;
                C0VSJ c0vsj = new C0VSJ(C936280aTK.LIZIZ);
                if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                    C089E c089e = new C089E(fileArrListFiles);
                    while (c089e.hasNext()) {
                        File file = (File) c089e.next();
                        if (file.isFile()) {
                            try {
                                file.delete();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("clearTmpPictureFiles error:");
                                sbLIZ.append(th.getMessage());
                                C20441214yg.LJ("CustomizeAvatarHelper", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CustomizeAvatarHelper$Companion@1623.clearTmpPictureFiles$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CustomizeAvatarHelper$Companion@1623.clearTmpPictureFiles$1");
            }
        });
    }

    public final Pair<Long, Integer> OR(Long l) {
        List<?> list;
        if (l == null) {
            l = this.LLJJIJIIJIL;
        }
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        C1117360fBO c1117360fBO = this.LLJILJIL;
        if (c1117360fBO == null || (list = c1117360fBO.LL) == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(jLongValue), C500260Jjc.LJI(list, new AwS30S0000100_15(jLongValue, 5)).getSecond());
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0aTI] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0aTO, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final boolean PR(long j) {
        AbstractC19484711Kz abstractC19484711KzLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectToStylize styleId:");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("MultiGuestCreateAvatarFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL = Long.valueOf(j);
        String str = this.LLJJ.get(Long.valueOf(j));
        if (str != null) {
            MR(j, str);
            return false;
        }
        if (C1533950q1J.LJ(this.LLJJIJI)) {
            String str2 = this.LLJJIJI;
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startToStylize styleId:");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("MultiGuestCreateAvatarFragment", C2188811AlT.LIZIZ(sbLIZ2));
            C19487311Lz.LIZIZ(C11NZ.LJIJJLI(new C987240bnW(this, 2)).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIFFI(), this.LLJILLL, new AfS5S0100100_15(j, this, 5), new AfS184S0100000_15(this, 97), new C987100bnI(this, 13), null, 48);
            boolean z = C936250aTH.LIZIZ;
            ?? r0 = new InterfaceC936370aTT() { // from class: X.0aTI
                @Override // X.InterfaceC936370aTT
                public final void LIZ() {
                    C09AJ<C936140aT6> c09aj = this.LIZ.LLJJJIL;
                    if (c09aj != null) {
                        c09aj.onNext(new C936140aT6(EnumC935940aSm.STATE_FAILED, -1));
                    }
                    C09AJ<C936140aT6> c09aj2 = this.LIZ.LLJJJIL;
                    if (c09aj2 != null) {
                        c09aj2.onComplete();
                    }
                }

                @Override // X.InterfaceC936370aTT
                public final void LIZIZ(int i) {
                    C09AJ<C936140aT6> c09aj = this.LIZ.LLJJJIL;
                    if (c09aj != null) {
                        c09aj.onNext(new C936140aT6(EnumC935940aSm.STATE_PROGRESS, (i * 50) / 100));
                    }
                }

                @Override // X.InterfaceC936370aTT
                public final void LIZJ(C936360aTS c936360aTS) {
                    List urls;
                    String str3;
                    C09AJ<C936140aT6> c09aj = this.LIZ.LLJJJIL;
                    if (c09aj != null) {
                        c09aj.onNext(new C936140aT6(EnumC935940aSm.STATE_PROGRESS, 80));
                    }
                    ImageModel imageModel = c936360aTS.LIZIZ;
                    if (imageModel != null && (urls = imageModel.getUrls()) != null && (str3 = (String) C13LP.LJJJLL(urls)) != null) {
                        MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = this.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("stylize_");
                        sbLIZ3.append(System.currentTimeMillis());
                        sbLIZ3.append(".jpg");
                        C207232167i.LIZIZ(new C207209166l(C2188811AlT.LIZIZ(sbLIZ3), EnumC771350UNp.MULTI_LIVE_AVATAR, null, null, str3, null, false, 3, false, 748), new AObjectS358S0100000_15(multiGuestCreateAvatarFragment, 62));
                    }
                }
            };
            AnonymousClass0114 anonymousClass0114 = C936250aTH.LJIIIZ;
            final C936310aTN c936310aTN = new C936310aTN(str2, j, r0, anonymousClass0114);
            c936310aTN.LJIIL = System.currentTimeMillis();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("start imageUri=");
            sbLIZ3.append(str2);
            sbLIZ3.append(", styleId=");
            sbLIZ3.append(j);
            C20441214yg.LIZIZ("ImageStyleTask", C2188811AlT.LIZIZ(sbLIZ3));
            ?? r1 = new AnonymousClass0115() { // from class: X.0aTO
                @Override // X.AnonymousClass0115
                public final void LIZIZ(Avatar avatar) {
                }

                @Override // X.AnonymousClass0115
                public final void LIZJ(AnonymousClass0117 anonymousClass0117) {
                }

                @Override // X.AnonymousClass0115
                public final void LIZ(C936360aTS c936360aTS) {
                    if (c936310aTN.LJIIJJI) {
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("ignore style message currentTask=");
                    sbLIZ4.append(c936310aTN.LJI);
                    sbLIZ4.append(", resultTask=");
                    sbLIZ4.append(c936360aTS.LIZ);
                    C20441214yg.LIZIZ("ImageStyleTask", C2188811AlT.LIZIZ(sbLIZ4));
                    C936310aTN c936310aTN2 = c936310aTN;
                    if (c936310aTN2.LJI == c936360aTS.LIZ) {
                        c936310aTN2.LIZJ.LIZIZ(100);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C936310aTN c936310aTN3 = c936310aTN;
                        long j2 = (jCurrentTimeMillis - c936310aTN3.LJIIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        if (c936360aTS.LIZJ == 1) {
                            c936310aTN3.LIZJ.LIZJ(c936360aTS);
                            C936310aTN c936310aTN4 = c936310aTN;
                            C936400aTW.LIZJ((int) j2, true, c936310aTN4.LIZIZ, c936310aTN4.LIZ, 0, "", false, false);
                        } else {
                            c936310aTN3.LIZJ.LIZ();
                            C936310aTN c936310aTN5 = c936310aTN;
                            C936400aTW.LIZJ((int) j2, false, c936310aTN5.LIZIZ, c936310aTN5.LIZ, c936360aTS.LIZJ, c936360aTS.LIZLLL, false, false);
                        }
                        c936310aTN.LIZ();
                    }
                }
            };
            c936310aTN.LJIIIIZZ = r1;
            if (anonymousClass0114 != null) {
                anonymousClass0114.LIZIZ.add((AnonymousClass0115) r1);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (((LinkedHashMap) C936250aTH.LJ).get(C936250aTH.LIZJ(j, str2)) != null) {
                abstractC19484711KzLIZ = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01Em
                    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.android.live.liveinteract.multilive.social.model.AvatarStylizeResp$ResponseData] */
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<C470590Icr<AvatarStylizeResp.ResponseData>> interfaceC2329309At) {
                        C470590Icr<AvatarStylizeResp.ResponseData> c470590Icr = new C470590Icr<>();
                        c470590Icr.statusCode = 0;
                        ?? r2 = (T) new AvatarStylizeResp.ResponseData();
                        r2.taskId = 0L;
                        c470590Icr.data = r2;
                        interfaceC2329309At.onSuccess(c470590Icr);
                    }
                });
                C936400aTW.LIZJ((int) (System.currentTimeMillis() - jCurrentTimeMillis), true, j, str2, 0, "", true, false);
            } else {
                AvatarStylizeReq avatarStylizeReq = new AvatarStylizeReq();
                avatarStylizeReq.imageUri = str2;
                avatarStylizeReq.styleId = j;
                avatarStylizeReq.applier = C936250aTH.LJ();
                avatarStylizeReq.common = C936250aTH.LIZLLL();
                C480460Ism.LIZ().getClass();
                abstractC19484711KzLIZ = C01NB.LIZ(((IAvatarAPI) C480460Ism.LIZLLL(IAvatarAPI.class)).stylizedPicture(avatarStylizeReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C953780avY.LIZIZ).LJIILL(new C09JN() { // from class: X.00SP
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("AvatarDataManager@42e9.stylized$2");
                        C930480aJy.LIZ.getClass();
                        C1C7U.LIZIZ("AvatarDataManager@42e9.stylized$2");
                    }
                }));
            }
            C19487311Lz.LIZJ(abstractC19484711KzLIZ.LJFF(new C0UO0()), c936310aTN.LJ, new AfS184S0100000_15(c936310aTN, 196), new AfS184S0100000_15(c936310aTN, 197), 24);
            return false;
        }
        NR();
        return true;
    }

    public final void SR(long j) {
        List<?> list;
        C1319900kS4 c1319900kS4;
        C766270U4b.LIZLLL(2131852815);
        if (this.LLJJJJJIL != null && (c1319900kS4 = this.LLILLL) != null) {
            c1319900kS4.setInterceptTouch(false);
        }
        C1117360fBO c1117360fBO = this.LLJILJIL;
        if (c1117360fBO != null && (list = c1117360fBO.LL) != null) {
            for (Object obj : list) {
                if (obj instanceof C936100aT2) {
                    C936100aT2 c936100aT2 = (C936100aT2) obj;
                    long j2 = c936100aT2.LIZ;
                    if (j2 == j) {
                        c936100aT2.LIZLLL = false;
                        c936100aT2.LJ = 0;
                        Long l = this.LLJJIJIIJIL;
                        if (l != null && l.longValue() == j) {
                            c936100aT2.LJI = false;
                        }
                    } else {
                        Long l2 = this.LLJJJJJIL;
                        if (l2 != null && j2 == l2.longValue()) {
                            c936100aT2.LJI = true;
                        }
                    }
                }
            }
        }
        this.LLJJIJIIJIL = this.LLJJJJJIL;
        C1117360fBO c1117360fBO2 = this.LLJILJIL;
        if (c1117360fBO2 != null) {
            c1117360fBO2.notifyDataSetChanged();
        }
    }

    public static final void VR(MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment, String str) {
        C204692157q c204692157q = C204692157q.LIZ;
        AwS664S0100000_15 awS664S0100000_15 = new AwS664S0100000_15(multiGuestCreateAvatarFragment, 7);
        c204692157q.getClass();
        C204692157q.LJ(str, awS664S0100000_15);
        C473410IhP.LIZIZ(new ARunnableS20S1100000_15(multiGuestCreateAvatarFragment, str, 3));
    }

    public final void MR(long j, String str) {
        this.LLJJJJJIL = Long.valueOf(j);
        C1319900kS4 c1319900kS4 = this.LLILLL;
        if (c1319900kS4 != null) {
            c1319900kS4.setInterceptTouch(false);
        }
        View view = getView();
        if (view != null) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.ic;
            if (c20337914i1.LIZIZ().booleanValue()) {
                c20337914i1.LJFF(Boolean.FALSE);
                C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.bio);
                if (c1295960jpS != null) {
                    C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_normal_1", "ttlive_multi_guest_create_avatar_guide.zip", "", true, null, Boolean.FALSE, null);
                    C12ES.LJIILL(0, c1295960jpS);
                    c1295960jpS.setRepeatCount(2);
                    c1295960jpS.setRepeatMode(1);
                    c1295960jpS.addAnimatorListener(new AAListenerS323S0100000_12(c1295960jpS, 11));
                    c1295960jpS.setOnTouchListener(new ATListenerS440S0100000_6(c1295960jpS, 8));
                }
            }
        }
        C20689515xd c20689515xd = this.LLILZ;
        if (c20689515xd != null) {
            c20689515xd.setOriginPath(str);
        }
        C20689515xd c20689515xd2 = this.LLILZ;
        if (c20689515xd2 != null) {
            C21513519Hh c21513519Hh = c20689515xd2.LLILLJJLI;
            if (c21513519Hh == null) {
                c21513519Hh = null;
            }
            c21513519Hh.LJII();
        }
    }

    public final void RR(Context context, C936170aT9 c936170aT9) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(2131852828);
        c782110Um9.LJII(2131852827);
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131852809);
        c755620TkW.LIZJ = new AcS496S0100000_15(this, 23);
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131852826);
        c755630TkX.LIZJ = new AcS354S0200000_15(c936170aT9, this, 7);
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 2;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAbstractAvatarFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        List<AvatarStyle> listQ51;
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.bkv)).setText(C497740JfY.LJIJI(2131852814));
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.l_a);
        C786410Ut5.g8(liveIconView, new ACListenerS118S0200000_15(this, liveIconView, 24));
        C16FS c16fs = (C16FS) view.findViewById(R.id.bil);
        this.LL = c16fs;
        C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, c16fs, 81));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bk7);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new C423500Gj6((int) C497740JfY.LIZIZ(16.0f)));
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(C936100aT2.class, new C935980aSq(new AwS594S0100000_15(this, 367), null));
        C410901il c410901il = new C410901il();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
            IAvatarBusinessAbility iAvatarBusinessAbility = (IAvatarBusinessAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IAvatarBusinessAbility.class, null);
            this.LLJJIJIL = iAvatarBusinessAbility;
            if (iAvatarBusinessAbility != null && (listQ51 = iAvatarBusinessAbility.Q51()) != null) {
                for (AvatarStyle avatarStyle : listQ51) {
                    c410901il.add(new C936100aT2(avatarStyle.styleId, avatarStyle.image, false, false, 0, false, false, true));
                }
            }
        }
        c1117360fBO.LL = c410901il;
        recyclerView.setAdapter(c1117360fBO);
        this.LLJILJIL = c1117360fBO;
        recyclerView.setItemAnimator(null);
        C20689515xd c20689515xd = (C20689515xd) view.findViewById(R.id.f_e);
        this.LLILZ = c20689515xd;
        C1336570ksx c1336570ksx = (C1336570ksx) c20689515xd.findViewById(R.id.ldv);
        if (c1336570ksx != null) {
            c1336570ksx.LLILZIL = 0;
            c1336570ksx.LLILZLL = 1.3f;
            c1336570ksx.LLILZ = 0;
        }
        C1319900kS4 c1319900kS4 = (C1319900kS4) view.findViewById(R.id.bi6);
        if (c1319900kS4 != null) {
            this.LLILLL = c1319900kS4;
            c1319900kS4.setInterceptTouch(true);
            c1319900kS4.setRadius((int) C497740JfY.LIZIZ(12.0f));
        }
        View viewFindViewById = view.findViewById(R.id.bi5);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke((int) C497740JfY.LIZIZ(2.0f), C20736316Cj.LIZIZ(R.attr.c5w, viewFindViewById.getContext()));
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(12.0f));
            viewFindViewById.setBackground(gradientDrawable);
        }
        View viewFindViewById2 = view.findViewById(R.id.bjj);
        if (viewFindViewById2 != null) {
            this.LLJIJIL = viewFindViewById2;
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0aT4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C20441214yg.LIZIZ("MultiGuestCreateAvatarFragment", "mask click, do nothing");
                }
            }, viewFindViewById2);
        }
        C16FS c16fs2 = (C16FS) view.findViewById(R.id.bim);
        if (c16fs2 != null) {
            this.LLILLJJLI = c16fs2;
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.exr, c16fs2.getContext());
            C14K9.LJIILLIIL(c16fs2, ColorStateList.valueOf(iLIZIZ));
            c16fs2.setBackground(new ColorDrawable(iLIZIZ));
            C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 82));
        }
        this.LLILZIL = view.findViewById(R.id.bji);
        this.LLILZLL = view.findViewById(R.id.bki);
        this.LLIZ = (LiveIconView) view.findViewById(R.id.bkh);
        this.LLIZLLLIL = (C20515815Po) view.findViewById(R.id.bkj);
        this.LLJ = (C16F5) view.findViewById(R.id.bkk);
        this.LLJI = (C16F5) view.findViewById(R.id.bkl);
        LiveIconView liveIconView2 = this.LLIZ;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS150S0100000_15(this, 83));
        }
        View viewFindViewById3 = view.findViewById(R.id.pwf);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS118S0200000_15(this, viewFindViewById3, 25), viewFindViewById3);
        }
        NR();
        C924600aAU.LIZJ("show", C917520Zz4.LJI(), C930540aK4.LJ() ? 1 : 0, null, null);
    }
}
