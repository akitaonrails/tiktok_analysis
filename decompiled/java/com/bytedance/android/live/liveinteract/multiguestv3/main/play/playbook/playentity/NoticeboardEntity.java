package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC19484711Kz;
import X.AbstractC20356314kz;
import X.C098J;
import X.C09JN;
import X.C0UO0;
import X.C0VSJ;
import X.C1017903yT;
import X.C1161920gLG;
import X.C11IW;
import X.C11JL;
import X.C11NJ;
import X.C11QI;
import X.C11S5;
import X.C13BV;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C176600m4;
import X.C176800m6;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C334801Rq;
import X.C497740JfY;
import X.C500260Jjc;
import X.C914990Zuz;
import X.C916750Zxp;
import X.C930480aJy;
import X.C930540aK4;
import X.C944400agQ;
import X.C947860am0;
import X.C953230auf;
import X.C953600avG;
import X.C953610avH;
import X.C970210bM3;
import X.C979250bad;
import X.C979290bah;
import X.EnumC952890au7;
import X.EnumC953170auZ;
import X.InterfaceC1487280oo2;
import X.InterfaceC20354714kj;
import X.InterfaceC420801kM;
import X.InterfaceC781210Ukh;
import X.InterfaceC917550Zz7;
import X.InterfaceC945610aiN;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import Y.ARunnableS16S0210000_15;
import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import Y.AfS28S0500000_15;
import Y.AfS41S1200000_15;
import Y.AkS36S0500000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardParam;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardEntity extends AbstractC20356314kz {
    public static final /* synthetic */ int LLLII = 0;
    public C916750Zxp LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;
    public C20361214lm LLJJLIIIJLLLLLLLZ;
    public C11JL LLJL;
    public C11JL LLJLIL;
    public EnumC953170auZ LLJZ;
    public Integer LLL;
    public C953600avG LLLFF;
    public LayoutConfig LLLFFI;
    public final HashMap<String, InterfaceC917550Zz7> LLLI;
    public final C20357914lF LLJJJJJIL = new C20357914lF("notice_board", 1, 35600000, 0, C1697810uHb.LJIIJJI("noticeboard_ongoing", "noticeboard_finish_setting", "noticeboard_finished", "never"), "noticeboard_start_setting", 4080);
    public final HashMap<String, String> LLJLILLLLZIIL = new HashMap<>();
    public final C098J<Long, Integer> LLJLL = new C098J<>();
    public final C098J<C916750Zxp, String> LLJLLIL = new C098J<>();
    public String LLJLLL = "playbook_entity";
    public String LLJZIJLIL = "cloud_success";
    public final C11NJ LLLF = new C11NJ();
    public final C979250bad LLLFZ = new InterfaceC917550Zz7() { // from class: X.0bad
        @Override // X.InterfaceC917550Zz7
        public final void LIZ() {
            C1AZW.LJIIJ(12, C01EI.LIZ(135, this.LIZ.LLJJJJJIL.LIZ), "onDialogShow", null, null);
            NoticeboardEntity noticeboardEntity = this.LIZ;
            System.currentTimeMillis();
            noticeboardEntity.getClass();
            NoticeboardEntity noticeboardEntity2 = this.LIZ;
            C20361214lm c20361214lm = noticeboardEntity2.LLJJLIIIJLLLLLLLZ;
            if (c20361214lm != null) {
                PlayEntityUtilKt.LJII(noticeboardEntity2, 2, c20361214lm, noticeboardEntity2.LLJJL, true);
            }
        }

        @Override // X.InterfaceC917550Zz7
        public final void LIZIZ(C916750Zxp c916750Zxp) {
            String strLIZ = C01EI.LIZ(92, this.LIZ.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReviewPassed noticeboardData=");
            sbLIZ.append(c916750Zxp);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            NoticeboardEntity noticeboardEntity = this.LIZ;
            C20361214lm c20361214lm = noticeboardEntity.LLJJLIIIJLLLLLLLZ;
            if (c20361214lm != null) {
                noticeboardEntity.LLJZ = null;
                noticeboardEntity.LLJJJJLIIL = null;
                noticeboardEntity.LJJLIIJ(c916750Zxp, new AwS224S0300000_15(noticeboardEntity, c916750Zxp, c20361214lm, 23), new AwS224S0300000_15(noticeboardEntity, c916750Zxp, c20361214lm, 24), false);
            }
        }

        @Override // X.InterfaceC917550Zz7
        public final void LJI(C916750Zxp c916750Zxp) {
            String strLIZ = C01EI.LIZ(81, this.LIZ.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onClose noticeboardData=");
            sbLIZ.append(c916750Zxp);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            NoticeboardEntity noticeboardEntity = this.LIZ;
            if (noticeboardEntity.LLJJLIIIJLLLLLLLZ != null) {
                noticeboardEntity.LLJZ = null;
                if (!C500260Jjc.LJJIL()) {
                    noticeboardEntity.LLJJJJLIIL = c916750Zxp;
                }
            }
        }

        @Override // X.InterfaceC917550Zz7
        public final void LIZJ(C916750Zxp c916750Zxp, String str) {
            String strLIZ = C01EI.LIZ(68, this.LIZ.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSave noticeboardData=");
            sbLIZ.append(c916750Zxp);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            NoticeboardEntity noticeboardEntity = this.LIZ;
            C20361214lm c20361214lm = noticeboardEntity.LLJJLIIIJLLLLLLLZ;
            if (c20361214lm != null) {
                noticeboardEntity.LLJZ = null;
                if (!C500260Jjc.LJJIL()) {
                    noticeboardEntity.LLJJJJLIIL = c916750Zxp;
                }
                NoticeboardParam noticeboardParamLJJLIIIJ = NoticeboardEntity.LJJLIIIJ(c916750Zxp);
                InterfaceC20354714kj interfaceC20354714kj = noticeboardEntity.LLJJL;
                String strLIZ2 = C979410bat.LIZ(362, "PLAYBOOK_UTIL");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("callbackConfigChangePrepared, rule.name=");
                sbLIZ2.append(noticeboardEntity.LLJJJJJIL.LIZ);
                sbLIZ2.append(", playbookTask=");
                sbLIZ2.append(c20361214lm);
                C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, noticeboardParamLJJLIIIJ);
                if (interfaceC20354714kj != null) {
                    interfaceC20354714kj.LIZ();
                }
                long j = c20361214lm.LIZIZ;
                for (InterfaceC20354714kj interfaceC20354714kj2 : noticeboardEntity.LL) {
                    String str2 = noticeboardEntity.LLJJJJJIL.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("invokeConfigChangePrepared, preParedJsonParams=");
                    sbLIZ3.append(json);
                    sbLIZ3.append(", stateId=");
                    sbLIZ3.append(j);
                    C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC20354714kj2.LIZ();
                }
            }
        }

        @Override // X.InterfaceC917550Zz7
        public final void LIZLLL(EnumC752510TfV enumC752510TfV, EnumC919100a1c enumC919100a1c) {
            C916750Zxp c916750Zxp;
            String strLIZ = C01EI.LIZ(143, this.LIZ.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDialogDismiss, reason=");
            sbLIZ.append(enumC919100a1c);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            NoticeboardEntity noticeboardEntity = this.LIZ;
            C20361214lm c20361214lm = noticeboardEntity.LLJJLIIIJLLLLLLLZ;
            if (c20361214lm != null) {
                boolean z = true;
                if ((!Intrinsics.LJFF(noticeboardEntity.LLJLLL, "playbook_edit") || enumC919100a1c == EnumC919100a1c.SAVE) && ((((c916750Zxp = noticeboardEntity.LLJJJJLIIL) != null && !InteractServiceDel.LLILLJJLI.z00(c916750Zxp)) || Intrinsics.LJFF(noticeboardEntity.LLJLLL, "playbook_edit") || enumC919100a1c != EnumC919100a1c.NORMAL) && !C500260Jjc.LJJIL())) {
                    z = false;
                }
                if (enumC752510TfV == EnumC752510TfV.GUIDE) {
                    C470360IcU.LIZIZ(new ARunnableS16S0210000_15(noticeboardEntity, z, c20361214lm, 4), 0L, TimeUnit.SECONDS);
                    return;
                }
                PlayEntityUtilKt.LJ(noticeboardEntity, 2, c20361214lm, noticeboardEntity.LLJJL);
                if (!z) {
                    return;
                }
                PlayEntityUtilKt.LIZLLL(noticeboardEntity);
            }
        }

        @Override // X.InterfaceC917550Zz7
        public final void LJFF(C916750Zxp c916750Zxp, String str) {
            String strLIZ = C01EI.LIZ(88, this.LIZ.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUpload noticeboardData=");
            sbLIZ.append(c916750Zxp);
            sbLIZ.append(", imageUrl=");
            sbLIZ.append(str);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        }

        @Override // X.InterfaceC917550Zz7
        public final void LJ(C916750Zxp c916750Zxp, EnumC953170auZ enumC953170auZ, Integer num) {
            String strLIZ = C01EI.LIZ(128, this.LIZ.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFail noticeboardData=");
            sbLIZ.append(c916750Zxp);
            sbLIZ.append(", failReason=");
            sbLIZ.append(enumC953170auZ);
            C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            NoticeboardEntity noticeboardEntity = this.LIZ;
            C20361214lm c20361214lm = noticeboardEntity.LLJJLIIIJLLLLLLLZ;
            if (c20361214lm != null) {
                noticeboardEntity.LLJZ = enumC953170auZ;
                if (!C500260Jjc.LJJIL()) {
                    noticeboardEntity.LLJJJJLIIL = c916750Zxp;
                }
                PlayEntityUtilKt.LIZIZ(noticeboardEntity, c20361214lm, noticeboardEntity.LLJJL, null, 0L, 56);
                if (C953180aua.LIZ[enumC953170auZ.ordinal()] != 1 && num != null) {
                    num.intValue();
                }
            }
        }
    };

    @Override // X.AbstractC20356314kz
    public final void LJJIJLIJ() {
        this.LLLFF = null;
        this.LLLFFI = null;
    }

    public static int LJJLIIIJJIZ() {
        return MultiguestNoticeboardV2Setting.INSTANCE.templateEnable() ? 2131854991 : 2131853923;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0bad] */
    public NoticeboardEntity() {
        C176600m4.LIZJ(new AwS559S0100000_15(this, 329));
        this.LLLI = new HashMap<>();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIJ() {
        InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
        this.LLLFF = interfaceC945610aiNLIZ != null ? interfaceC945610aiNLIZ.LIZJ() : null;
        this.LLLFFI = C947860am0.LIZIZ();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        super.destroy();
        C176600m4.LIZJ(new AwS559S0100000_15(this, 330));
        this.LLJJL = null;
        this.LLLF.dispose();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    public static NoticeboardParam LJJLIIIJ(C916750Zxp c916750Zxp) {
        int i = c916750Zxp.LIZ;
        if (i != 1) {
            if (i != 2) {
                return new NoticeboardParam(0, null, -1L);
            }
            return new NoticeboardParam(2, c916750Zxp.LIZJ, c916750Zxp.LIZIZ);
        }
        return new NoticeboardParam(1, null, c916750Zxp.LIZIZ);
    }

    public static C20365714mV LJJLIIIJJI(String str) {
        C0VSJ c0vsj;
        if (str != null) {
            c0vsj = new C0VSJ(str);
        } else {
            c0vsj = null;
        }
        return new C20365714mV(c0vsj, R.attr.ey9, 1.0f, null, null, null, 0.0f, 241);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJI(Function2 function2) {
        C953600avG c953600avG = this.LLLFF;
        if (c953600avG != null) {
            InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
            if (interfaceC945610aiNLIZ != null) {
                interfaceC945610aiNLIZ.LJ(c953600avG);
            }
            function2.invoke(Boolean.TRUE, null);
            return;
        }
        InterfaceC945610aiN interfaceC945610aiNLIZ2 = C944400agQ.LIZ();
        if (interfaceC945610aiNLIZ2 != null) {
            interfaceC945610aiNLIZ2.LJFF(new AwS381S0200000_15(this, (NoticeboardEntity) function2, (Function2<? super Boolean, ? super String, Unit>) 78));
        } else {
            function2.invoke(Boolean.FALSE, "NoticeboardService is null");
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!LJJLIIIJLLLLLLLZ(c20361214lm)) {
            C953610avH.LJJI.getClass();
            this.LLLF.LIZ(new C11IW(C953610avH.LJJIII.LJJIJIIJIL(new AfS151S0200000_15(this, c20361214lm, 26))).LJIJI(new C09JN() { // from class: X.0bag
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("NoticeboardEntity@cd1e.runManual$3");
                    C1C7U.LIZIZ("NoticeboardEntity@cd1e.runManual$3");
                }
            }, new InterfaceC781210Ukh() { // from class: X.0bai
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                }
            }));
        }
    }

    public final List<String> LJJLIIIJILLIZJL(Integer num) {
        if (num == null) {
            num = this.LLL;
        }
        this.LLL = num;
        if (num != null) {
            if (num.intValue() == 0) {
                return Collections.singletonList(C497740JfY.LJIJI(2131841485));
            }
            if (num.intValue() == 1) {
                return Collections.singletonList(C497740JfY.LJIJI(2131841486));
            }
            if (num.intValue() == 2) {
                return C13BV.INSTANCE;
            }
            if (num.intValue() == 3) {
                return Collections.singletonList(C497740JfY.LJIJI(2131841485));
            }
            if (num.intValue() == 4) {
                return Collections.singletonList(C497740JfY.LJIJI(2131841485));
            }
        }
        return C13BV.INSTANCE;
    }

    public final boolean LJJLIIIJLLLLLLLZ(C20361214lm c20361214lm) {
        String str = c20361214lm.LJI;
        if (str != null && !a0.LJJJIL(str)) {
            String str2 = C970210bM3.LIZ(C979290bah.LIZ(c20361214lm.LJI)).LIZJ;
            C953610avH.LJJI.getClass();
            if (Intrinsics.LJFF(str2, C953610avH.LJJII)) {
                LJJIJ();
                return true;
            }
        } else {
            C953610avH.LJJI.getClass();
            String str3 = C953610avH.LJJII;
            if (str3 != null && str3.length() != 0) {
                LJJIJ();
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        boolean z2;
        String str = c20361214lm.LJI;
        if (str != null && !a0.LJJJIL(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mVLJJLIIIJJI;
        C916750Zxp c916750ZxpLIZ = C970210bM3.LIZ(C979290bah.LIZ(c20424814w2.LJII));
        String str = this.LLJJJJJIL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseUIConfig noticeboardData=");
        sbLIZ.append(c916750ZxpLIZ);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        boolean z = true;
        if (!a0.LJJJIL(c916750ZxpLIZ.LIZJ) || c916750ZxpLIZ.LIZIZ > 0) {
            LJJLIIJ(c916750ZxpLIZ, new AwS224S0300000_15(this, c916750ZxpLIZ, c20424814w2, 39), new AwS224S0300000_15(this, c916750ZxpLIZ, c20424814w2, 40), true);
        }
        String strLJIJI = C497740JfY.LJIJI(LJJLIIIJJIZ());
        String strLJIJI2 = C497740JfY.LJIJI(LJJLIIIJJIZ());
        List<String> listLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(this.LLJLL.get(Long.valueOf(c916750ZxpLIZ.LIZIZ)));
        String str2 = this.LLJLLIL.get(c916750ZxpLIZ);
        String str3 = null;
        if (str2 == null || (c20365714mVLJJLIIIJJI = LJJLIIIJJI(str2)) == null) {
            int i2 = c916750ZxpLIZ.LIZ;
            if (i2 != 1) {
                if (i2 == 2) {
                    str3 = this.LLJLILLLLZIIL.get(c916750ZxpLIZ.LIZJ);
                }
            } else {
                str3 = this.LLJLILLLLZIIL.get(String.valueOf(c916750ZxpLIZ.LIZIZ));
            }
            c20365714mVLJJLIIIJJI = LJJLIIIJJI(str3);
        }
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            z = false;
        }
        return new C20361314ln(strLJIJI, strLJIJI2, R.attr.ctk, R.attr.ctk, listLJJLIIIJILLIZJL, c20365714mVLJJLIIIJJI, i, null, z, null, 3712);
    }

    public final void LJJLIL(C916750Zxp c916750Zxp, String str) {
        if (str != null && str.length() != 0) {
            int i = c916750Zxp.LIZ;
            if (i == 2) {
                this.LLJLILLLLZIIL.put(c916750Zxp.LIZJ, str);
            } else {
                if (i != 1) {
                    return;
                }
                this.LLJLILLLLZIIL.put(String.valueOf(c916750Zxp.LIZIZ), str);
            }
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 15);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        Context contextLIZJ;
        AbstractC19484711Kz abstractC19484711KzLJIJJLI;
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        if (lifecycleOwner != null && (contextLIZJ = PlaybookUtilKt.LIZJ(lifecycleOwner)) != null) {
            C916750Zxp c916750ZxpLIZ = C970210bM3.LIZ(C979290bah.LIZ(c20361214lm.LJI));
            String str = c20361214lm.LJI;
            if (str != null && !a0.LJJJIL(str)) {
                abstractC19484711KzLJIJJLI = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Jg0(c916750ZxpLIZ).LJFF(new C0UO0()).LJIIIZ(new AfS109S0300000_15(c916750ZxpLIZ, interfaceC979390bar, c20361214lm, 8)).LJIIL(new AfS151S0200000_15(interfaceC979390bar, c20361214lm, 25));
            } else {
                abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJLI("");
            }
            this.LLLF.LIZ(new C11QI(abstractC19484711KzLJIJJLI.LJIIL(new AfS28S0500000_15(this, contextLIZJ, c916750ZxpLIZ, interfaceC979390bar, c20361214lm, 1)).LJIL(new AkS36S0500000_15(this, contextLIZJ, c916750ZxpLIZ, interfaceC979390bar, c20361214lm, 0))).LJIILL().LJIIZILJ());
            return;
        }
        interfaceC979390bar.LIZLLL(c20361214lm.LIZIZ, "");
    }

    public final void LJJLIIIJLJLI(C20424814w2 c20424814w2, Integer num, String str) {
        boolean z;
        String strLJIJI = C497740JfY.LJIJI(LJJLIIIJJIZ());
        String strLJIJI2 = C497740JfY.LJIJI(LJJLIIIJJIZ());
        List<String> listLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(num);
        C20365714mV c20365714mVLJJLIIIJJI = LJJLIIIJJI(str);
        int iLIZ = PlayEntityUtilKt.LIZ(this, c20424814w2);
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            z = false;
        } else {
            z = true;
        }
        LJJJJJ(new C20361314ln(strLJIJI, strLJIJI2, R.attr.ctk, R.attr.ctk, listLJJLIIIJILLIZJL, c20365714mVLJJLIIIJJI, iLIZ, null, z, null, 3712), this.LLJJJJJIL.LIZLLL);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str, null);
    }

    public final void LJJLIIIJL(final long j, final String str, final C20424814w2 c20424814w2, Throwable th) {
        if (j > 0 && !(th instanceof C176800m6)) {
            Integer num = this.LLJLL.get(Long.valueOf(j));
            if (num != null) {
                LJJLIIIJLJLI(c20424814w2, num, str);
                return;
            }
            C953230auf.LIZ.getClass();
            this.LLLF.LIZ(new C11QI(C953230auf.LJIIIIZZ(j).LJIL(new InterfaceC1487280oo2() { // from class: X.00DQ
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return Integer.valueOf(((NoticeboardTemplate) obj).reviewStatus);
                }
            }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C09JN() { // from class: X.0bae
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("NoticeboardEntity@cd1e.getReviewStatusAndTriggerConfigUpdate$1");
                    Integer num2 = (Integer) obj;
                    String str2 = this.LL.LLJJJJJIL.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getTemplateReviewStatusById success, resp=");
                    sbLIZ.append(num2);
                    C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                    this.LL.LLJLL.put(Long.valueOf(j), num2);
                    this.LL.LJJLIIIJLJLI(c20424814w2, num2, str);
                    C1C7U.LIZIZ("NoticeboardEntity@cd1e.getReviewStatusAndTriggerConfigUpdate$1");
                }
            }).LJIIL(new AfS41S1200000_15(this, c20424814w2, str, 0))).LJIILL().LJIIZILJ());
            return;
        }
        LJJLIIIJLJLI(c20424814w2, null, str);
    }

    public final void LJJLIIJ(C916750Zxp c916750Zxp, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12, boolean z) {
        if (z) {
            C11JL c11jl = this.LLJLIL;
            if (c11jl != null) {
                c11jl.dispose();
            }
        } else {
            C11JL c11jl2 = this.LLJL;
            if (c11jl2 != null) {
                c11jl2.dispose();
            }
        }
        if (InteractServiceDel.LLILLJJLI.z00(c916750Zxp)) {
            if (function12 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("noticeboardData isNullOrEmpty, noticeboardData=");
                sbLIZ.append(c916750Zxp);
                function12.invoke(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
                return;
            }
            return;
        }
        InterfaceC420801kM interfaceC420801kMLJJIIZ = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Jg0(c916750Zxp).LJFF(new C0UO0()).LJJIIZ(new AfS151S0200000_15(this, function1, 24), new AfS109S0300000_15(this, c916750Zxp, function12, 7));
        this.LLLF.LIZ(interfaceC420801kMLJJIIZ);
        if (z) {
            this.LLJLIL = (C11JL) interfaceC420801kMLJJIIZ;
        } else {
            this.LLJL = (C11JL) interfaceC420801kMLJJIIZ;
        }
    }

    public final void LJJLJLI(Context context, C916750Zxp c916750Zxp, final InterfaceC979390bar interfaceC979390bar, final C20361214lm c20361214lm) {
        final String strLIZ = C1017903yT.LIZ();
        InterfaceC917550Zz7 interfaceC917550Zz7 = new InterfaceC917550Zz7() { // from class: X.0baf
            public boolean LIZ;

            @Override // X.InterfaceC917550Zz7
            public final void LIZIZ(C916750Zxp c916750Zxp2) {
            }

            @Override // X.InterfaceC917550Zz7
            public final void LJFF(C916750Zxp c916750Zxp2, String str) {
            }

            @Override // X.InterfaceC917550Zz7
            public final void LJI(C916750Zxp c916750Zxp2) {
            }

            @Override // X.InterfaceC917550Zz7
            public final void LIZ() {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    interfaceC979390bar2.LIZ(false);
                }
            }

            @Override // X.InterfaceC917550Zz7
            public final void LIZJ(C916750Zxp c916750Zxp2, String str) {
                Gson gson = C19748512Ol.LIZJ;
                this.LIZIZ.getClass();
                String json = GsonProtectorUtils.toJson(gson, NoticeboardEntity.LJJLIIIJ(c916750Zxp2));
                this.LIZIZ.LJJLIL(c916750Zxp2, str);
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    interfaceC979390bar2.LJI(c20361214lm.LIZIZ, json, true);
                }
                this.LIZ = true;
                this.LIZIZ.LLLI.remove(strLIZ);
            }

            @Override // X.InterfaceC917550Zz7
            public final void LIZLLL(EnumC752510TfV enumC752510TfV, EnumC919100a1c enumC919100a1c) {
                InterfaceC979390bar interfaceC979390bar2;
                if (!this.LIZ && (interfaceC979390bar2 = interfaceC979390bar) != null) {
                    interfaceC979390bar2.LIZJ();
                }
                this.LIZIZ.LLLI.remove(strLIZ);
            }

            @Override // X.InterfaceC917550Zz7
            public final void LJ(C916750Zxp c916750Zxp2, EnumC953170auZ enumC953170auZ, Integer num) {
                InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                if (interfaceC979390bar2 != null) {
                    interfaceC979390bar2.LIZLLL(c20361214lm.LIZIZ, enumC953170auZ.name());
                }
                this.LIZ = true;
                this.LIZIZ.LLLI.remove(strLIZ);
            }
        };
        this.LLLI.put(strLIZ, interfaceC917550Zz7);
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Bg0(context, this.LLJ, EnumC952890au7.PLAYBOOK_EDIT, c916750Zxp, false, false, new WeakReference<>(interfaceC917550Zz7), null, null, null);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        String str2 = c20361214lm.LJI;
        if (str2 != null && !a0.LJJJIL(str2)) {
            C914990Zuz.LIZ(C970210bM3.LIZ(C979290bah.LIZ(c20361214lm.LJI))).LJIILL(new AfS151S0200000_15(interfaceC953350aur, c334801Rq, 23)).LJIIL(new AfS184S0100000_15(interfaceC953350aur, 62)).LJJIIJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJ(X.C20361214lm r26, X.InterfaceC20354714kj r27, androidx.lifecycle.LifecycleOwner r28, java.lang.String r29, X.C334801Rq r30) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity.LJJLJ(X.14lm, X.14kj, androidx.lifecycle.LifecycleOwner, java.lang.String, X.01Rq):void");
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        LJJLJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str3, new C334801Rq(str, l, str2));
    }
}
