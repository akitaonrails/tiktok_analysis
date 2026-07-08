package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cKL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.adcardcomponent.videocard.AnoleVideoCardComponent$preloadCoverList$1", f = "AnoleVideoCardComponent.kt", l = {}, m = "invokeSuspend")
public final class C1007590cKL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<AnoleProductModel> LL;
    public final /* synthetic */ C1013180cTM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007590cKL(List<AnoleProductModel> list, C1013180cTM c1013180cTM, InterfaceC1364105Vn<? super C1007590cKL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1013180cTM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007590cKL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String dynamicCover;
        int i;
        C1C7U.LIZ("AnoleVideoCardComponent@fb5f.preloadCoverList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<AnoleProductModel> list = this.LL;
        final C1013180cTM c1013180cTM = this.LLILLJJLI;
        final int i2 = 0;
        for (AnoleProductModel anoleProductModel : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                AnoleProductModel anoleProductModel2 = anoleProductModel;
                if (c1013180cTM.LLJLILLLLZIIL.get(C2286608xc.LJ(i2)) == null && (dynamicCover = anoleProductModel2.getDynamicCover()) != null) {
                    int i4 = C1013300cTY.LLJIJIL;
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(C1697930uHn.LIZIZ(C06ZK.LIZ(c1013180cTM.LLILZ)))));
                    if (C06ZK.LIZ(c1013180cTM.LLILZ)) {
                        i = 142;
                    } else {
                        i = 207;
                    }
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(i)));
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(dynamicCover);
                    c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
                    c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
                    c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
                    c1331670kl3LJIIIZ.LIZLLL("multi_video_card");
                    c1331670kl3LJIIIZ.LJJIJL(c1013180cTM.LLILZ);
                    c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.0cKM
                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            Pair<Integer, Integer> pairLIZ;
                            if (bitmap != null) {
                                C1013180cTM c1013180cTM2 = c1013180cTM;
                                c1013180cTM2.LLJLILLLLZIIL.put(Integer.valueOf(i2), bitmap);
                            }
                            if (i2 == 0) {
                                C1013180cTM c1013180cTM3 = c1013180cTM;
                                if (bitmap != null) {
                                    pairLIZ = C436320H9a.LIZ(bitmap);
                                } else {
                                    pairLIZ = null;
                                }
                                c1013180cTM3.LLJLL = pairLIZ;
                            }
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            String message;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onFailed");
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ.append(message);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    });
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnoleVideoCardComponent@fb5f.preloadCoverList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
