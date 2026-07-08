package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.data.network.MusicGiftRetrofitApi;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147690fyJ implements InterfaceC597550Nc9 {
    public final MusicGiftRetrofitApi LIZ;
    public final C1147750fyP LIZIZ;

    public C1147690fyJ() {
        this(0);
    }

    @Override // X.InterfaceC597550Nc9
    public final InterfaceC346201Wa<AbstractC1147530fy3<List<C1147390fxp>>> LIZIZ() {
        return LJFF(new C1147720fyM(this, null), new C1147360fxm(this), new C1147650fyF());
    }

    public C1147690fyJ(int i) {
        C480460Ism.LIZ().getClass();
        MusicGiftRetrofitApi musicGiftRetrofitApi = (MusicGiftRetrofitApi) C480460Ism.LIZLLL(MusicGiftRetrofitApi.class);
        C1147750fyP c1147750fyP = new C1147750fyP();
        this.LIZ = musicGiftRetrofitApi;
        this.LIZIZ = c1147750fyP;
    }

    public static C1147540fy4 LJ(C470590Icr c470590Icr) {
        if (c470590Icr.statusCode == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGift response status code is ");
        sbLIZ.append(c470590Icr.statusCode);
        return new C1147540fy4(null, C2188811AlT.LIZIZ(sbLIZ), 1);
    }

    @Override // X.InterfaceC597550Nc9
    public final InterfaceC346201Wa<AbstractC1147530fy3<C1147420fxs>> LIZ(long j, long j2, long j3) {
        return LJFF(new C1147730fyN(this, j, j3, j2, null), new C1147740fyO(this), new C1147770fyR());
    }

    @Override // X.InterfaceC597550Nc9
    public final Object LIZJ(int i, List<Long> list, InterfaceC1364105Vn<? super AbstractC1147530fy3<? extends List<? extends Gift>>> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1147680fyI(this, i, list, null));
    }

    @Override // X.InterfaceC597550Nc9
    public final InterfaceC346201Wa<AbstractC1147530fy3<C1147330fxj>> LIZLLL(long j, long j2, String str) {
        return LJFF(new C1147710fyL(this, j, j2, str, null), new C1147760fyQ(this), new C1147780fyS());
    }

    public final <T, R> InterfaceC346201Wa<AbstractC1147530fy3<R>> LJFF(Function1<? super InterfaceC1364105Vn<? super C470590Icr<T>>, ? extends Object> function1, Function1<? super T, ? extends R> function12, Function1<? super R, Boolean> function13) {
        return C09IC.LJIL(new C2501109r7(new C1147700fyK(null), new C095D(new C1147670fyH(function1, this, function12, function13, null)), 0), C0PEM.LIZJ);
    }
}
