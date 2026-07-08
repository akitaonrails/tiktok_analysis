package X;

import Y.AgS4S0220000_9;
import android.content.Context;
import com.ss.android.ugc.aweme.music.api.MusicDetailApiV2;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OG7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel$getMusicDetail$1", f = "MusicDetailViewModel.kt", l = {232}, m = "invokeSuspend")
public final class C0OG7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TreeMap<String, String> LLILZIL;
    public final /* synthetic */ MusicDetailViewModel LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OG7(String str, boolean z, int i, TreeMap<String, String> treeMap, MusicDetailViewModel musicDetailViewModel, boolean z2, Context context, InterfaceC1364105Vn<? super C0OG7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = treeMap;
        this.LLILZLL = musicDetailViewModel;
        this.LLIZ = z2;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OG7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C0O3P c0o3p;
        C1C7U.LIZ("MusicDetailViewModel@92b7.getMusicDetail$1");
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
            C0OG3 c0og3 = MusicDetailApiV2.LIZ;
            String str = this.LLILLJJLI;
            if (str != null) {
                boolean z = this.LLILLL;
                Integer numLJ = C2286608xc.LJ(this.LLILZ);
                TreeMap<String, String> treeMap = this.LLILZIL;
                c0og3.getClass();
                C613950O6f c613950O6fLIZ = C613940O6e.LIZ();
                if (numLJ != null) {
                    iIntValue = numLJ.intValue();
                } else {
                    iIntValue = 0;
                }
                C613960O6g c613960O6gLIZIZ = c613950O6fLIZ.LIZIZ(new C0OG9(iIntValue, str, treeMap));
                C0O4P<MusicDetail> value = C0OG3.LIZIZ.getValue();
                AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(16);
                AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(412);
                Intrinsics.LJFF(MusicDetail.class, C0OG8.class);
                c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C0OG8.class, MusicDetail.class)));
                if (!z) {
                    c0o3p = C0O3P.NetWhenCacheMiss;
                } else {
                    c0o3p = C0O3P.NetworkOnly;
                }
                C0O7F.LIZIZ(c613960O6gLIZIZ, c0o3p);
                InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
                AgS4S0220000_9 agS4S0220000_9 = new AgS4S0220000_9(this.LLILZLL, this.LLILLL, this.LLIZ, this.LLIZLLLIL, 0);
                this.LL = 1;
                if (interfaceC346201WaLIZIZ.collect(agS4S0220000_9, this) == objLJFF) {
                    C1C7U.LIZIZ("MusicDetailViewModel@92b7.getMusicDetail$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDetailViewModel@92b7.getMusicDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
