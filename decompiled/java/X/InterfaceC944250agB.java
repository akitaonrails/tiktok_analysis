package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.CohostReserveMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.bpea.basics.Cert;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.0agB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC944250agB extends InterfaceC925160aBO {
    void AC(long j);

    void DD1(int i);

    void EM1(C943870afZ c943870afZ, WeakReference<InterfaceC978780bZs> weakReference, Boolean bool);

    boolean GC2(int i);

    void Gm(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage);

    void Gq1();

    void Hr(PerceptionMessage perceptionMessage);

    void Ht(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage);

    void J31(List<BattleUserInfoWrapper> list);

    void JL1();

    void NL2(boolean z);

    void QE0(C954640aww c954640aww);

    void Qs(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage);

    void Qz2(boolean z, C952540atY c952540atY);

    void SB2(int i, Cert cert, String str, MHPermitJoinBizContent mHPermitJoinBizContent);

    void Sx0(C954640aww c954640aww);

    void VM1();

    void XQ(LinkMicBattleMessage linkMicBattleMessage);

    void YJ(long j);

    void Yq(LinkMessage linkMessage);

    void gd(CapsuleMessage capsuleMessage);

    void jD0(C974210bSV c974210bSV);

    void jX(EnumC925190aBR enumC925190aBR, Throwable th);

    void pF(EnumC925190aBR enumC925190aBR);

    void qH2(EnumC919210a1n enumC919210a1n);

    void sE0();

    void uo0();

    void vA1(CohostReserveMessage cohostReserveMessage);

    void vr1(LinkMicBattleMessage linkMicBattleMessage);

    void wz2();
}
