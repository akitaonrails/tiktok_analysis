package X;

import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.ab.BulletinBoardEasterEggSetting;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEasterEggAssem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEasterEggAssem$tryShowEasterEgg$1", f = "BulletinEasterEggAssem.kt", l = {178}, m = "invokeSuspend")
public final class C636780OyK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinEasterEggAssem LLILLJJLI;
    public final /* synthetic */ C0OST LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636780OyK(BulletinEasterEggAssem bulletinEasterEggAssem, C0OST c0ost, InterfaceC1364105Vn<? super C636780OyK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinEasterEggAssem;
        this.LLILLL = c0ost;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636780OyK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo bulletinBoardEasterEggInfo;
        C636810OyN c636810OyN;
        BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo next;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        C1C7U.LIZ("BulletinEasterEggAssem@494c.tryShowEasterEgg$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        ?? r12 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0OPX.LJIIIZ("BulletinEasterEggAssemtryShowEasterEgg");
            BulletinEasterEggAssem bulletinEasterEggAssem = this.LLILLJJLI;
            C0OST c0ost = this.LLILLL;
            bulletinEasterEggAssem.getClass();
            try {
                Iterator<BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo> it2 = BulletinBoardEasterEggSetting.LIZ().easterEggInfo.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo bulletinBoardEasterEggInfo2 = next;
                        boolean z5 = false;
                        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "is_bb_easter_egg_campaign_holdout", r12, false)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str2 = bulletinBoardEasterEggInfo2.bulletinBoardId;
                        C0OLV c0olv = (C0OLV) bulletinEasterEggAssem.LLIZLLLIL.getValue();
                        if (c0olv != null) {
                            str = c0olv.LL;
                        } else {
                            str = null;
                        }
                        boolean zLJFF = Intrinsics.LJFF(str2, str);
                        int i2 = C0OSU.LIZ[c0ost.ordinal()];
                        if (i2 != r12) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    if (BulletinBoardEasterEggSetting.LIZ().easterEggTriggerWay == EnumC636800OyM.EMOJI.getValue() && bulletinEasterEggAssem.Go(bulletinBoardEasterEggInfo2.campaignId) < BulletinBoardEasterEggSetting.LIZ().easterEggMaxShowCount) {
                                        z2 = true;
                                    }
                                    z2 = false;
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                if (BulletinBoardEasterEggSetting.LIZ().easterEggTriggerWay == EnumC636800OyM.SUBSCRIBE.getValue() && bulletinEasterEggAssem.Go(bulletinBoardEasterEggInfo2.campaignId) < r12) {
                                    z2 = true;
                                }
                                z2 = false;
                            }
                        } else if (BulletinBoardEasterEggSetting.LIZ().easterEggTriggerWay == EnumC636800OyM.SUBSCRIBE.getValue() && bulletinEasterEggAssem.Go(bulletinBoardEasterEggInfo2.campaignId) < BulletinBoardEasterEggSetting.LIZ().easterEggMaxShowCount) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        long j = CastLongProtector.parseLong(bulletinBoardEasterEggInfo2.eventStartTime);
                        long j2 = CastLongProtector.parseLong(bulletinBoardEasterEggInfo2.eventEndTime);
                        long jLIZ = C0XK4.LIZ();
                        if (j <= jLIZ && jLIZ <= j2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BulletinEasterEggAssem\n                experiment: ");
                        sbLIZ.append(z);
                        sbLIZ.append("\n                isReadyToShow: ");
                        if (!bulletinEasterEggAssem.LLJJ) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        sbLIZ.append(z4);
                        sbLIZ.append("\n                sameBulletinId: ");
                        sbLIZ.append(zLJFF);
                        sbLIZ.append("\n                needShowEasterEgg: ");
                        sbLIZ.append(z2);
                        sbLIZ.append("\n                inEventTime: ");
                        sbLIZ.append(z3);
                        sbLIZ.append("\n            ");
                        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                        if (z && !bulletinEasterEggAssem.LLJJ && zLJFF && z2 && z3) {
                            z5 = true;
                        }
                        if (z5) {
                            break;
                        }
                        r12 = 1;
                    } else {
                        next = null;
                        break;
                    }
                }
                bulletinBoardEasterEggInfo = next;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BulletinEasterEggAssemfindEasterEggInfo error: ");
                sbLIZ2.append(e.getMessage());
                C0OPX.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                bulletinBoardEasterEggInfo = null;
            }
            if (bulletinBoardEasterEggInfo != null) {
                BulletinEasterEggAssem bulletinEasterEggAssem2 = this.LLILLJJLI;
                View viewLJJIJL = bulletinEasterEggAssem2.LJJIJL();
                if (viewLJJIJL instanceof C636810OyN) {
                    c636810OyN = (C636810OyN) viewLJJIJL;
                } else {
                    c636810OyN = null;
                }
                if (c636810OyN != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C636790OyL c636790OyL = new C636790OyL(bulletinEasterEggAssem2, bulletinBoardEasterEggInfo, c636810OyN, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c636790OyL) == objLJFF) {
                        C1C7U.LIZIZ("BulletinEasterEggAssem@494c.tryShowEasterEgg$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEasterEggAssem@494c.tryShowEasterEgg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
