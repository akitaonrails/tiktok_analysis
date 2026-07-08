package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HTU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$getStickerByID$2$1$deferred$1$1", f = "MixStudioStatusRepoImpl.kt", l = {963}, m = "invokeSuspend")
public final class C0HTU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StickerImage LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HTU(StickerImage stickerImage, MixStudioStatusRepoImpl mixStudioStatusRepoImpl, InterfaceC1364105Vn<? super C0HTU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerImage;
        this.LLILLL = mixStudioStatusRepoImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HTU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        final String str;
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2$1$deferred$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StickerImage stickerImage = this.LLILLJJLI;
            unit = null;
            if (stickerImage != null) {
                final MixStudioStatusRepoImpl mixStudioStatusRepoImpl = this.LLILLL;
                this.LL = 1;
                mixStudioStatusRepoImpl.getClass();
                final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                List<String> list = stickerImage.urlList;
                if (list != null) {
                    str = (String) ListProtector.get(list, 0);
                } else {
                    str = null;
                }
                C0HQV.LIZ.getClass();
                final int iLIZJ = C0HQV.LIZJ();
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(iLIZJ, iLIZJ);
                ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), null)).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0HTV
                    @Override // X.C0HWE
                    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                        if (c2252611DEt.isActive()) {
                            InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                            Unit unit2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(unit2);
                            interfaceC20236714Gf.resumeWith(unit2);
                        }
                        mixStudioStatusRepoImpl.LJIJJLI().LIZ("TaskStatusRepo", "[sticker] preload image fails");
                        interfaceC1320200kSY.close();
                    }

                    @Override // X.C0HWE
                    public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                        C1323050kX9<AbstractC1327750kej> result;
                        if (interfaceC1320200kSY.LIZ() && (result = interfaceC1320200kSY.getResult()) != null) {
                            try {
                                boolean z = result.get() instanceof C1329380khM;
                                C0HQT c0hqt = C0HQT.LIZ;
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                int i2 = iLIZJ;
                                c0hqt.getClass();
                                C0HQT.LIZ(i2, jCurrentTimeMillis2, z);
                                if (c2252611DEt.isActive()) {
                                    InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                                    Unit unit2 = Unit.LIZ;
                                    C189200o6.m2constructorimpl(unit2);
                                    interfaceC20236714Gf.resumeWith(unit2);
                                }
                                C1910890zpH c1910890zpHLJIJJLI = mixStudioStatusRepoImpl.LJIJJLI();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[sticker] preload image completes ");
                                sbLIZ.append(str);
                                c1910890zpHLJIJJLI.LIZ("TaskStatusRepo", C2188811AlT.LIZIZ(sbLIZ));
                                C1323050kX9.LJII(result);
                                interfaceC1320200kSY.close();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1323050kX9.LJII(result);
                                interfaceC1320200kSY.close();
                                throw th;
                            }
                        }
                    }
                }, C822700WPc.LL);
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ != C099R.LJFF()) {
                    objLJIJ = Unit.LIZ;
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2$1$deferred$1$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2$1$deferred$1$1");
            return unit;
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getStickerByID$2$1$deferred$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
