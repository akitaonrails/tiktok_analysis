package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS131S1100000_17;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.08lJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.preview.MusicGiftPreviewPlayer$loadLyricsForSource$1", f = "MusicGiftPreviewPlayer.kt", l = {864}, m = "invokeSuspend")
public final class C2210308lJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210308lJ(String str, InterfaceC1364105Vn<? super C2210308lJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2210308lJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MusicGiftPreviewPlayer@5196.loadLyricsForSource$1");
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
            C2209808lE c2209808lE = C2209808lE.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c2209808lE.getClass();
            String string = a0.LJLIIIL(str).toString();
            obj = null;
            if (!a0.LJJJIL(string)) {
                List listLIZ = C2209808lE.LIZ(string);
                if (listLIZ != null) {
                    obj = listLIZ;
                } else {
                    obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2209708lD(string, null));
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.loadLyricsForSource$1");
                return objLJFF;
            }
        }
        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
        AwS131S1100000_17 awS131S1100000_17 = new AwS131S1100000_17(this.LLILLJJLI, (String) obj, (List<C2209908lF>) 5);
        c1142070fpF.getClass();
        C1142070fpF.LJJII(awS131S1100000_17);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.loadLyricsForSource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
