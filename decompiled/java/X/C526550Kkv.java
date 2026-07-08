package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Kkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.selection.AlbumSelectionDataComponent$swap$2", f = "AlbumSelectionDataComponent.kt", l = {128}, m = "invokeSuspend")
public final class C526550Kkv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C526590Kkz LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C259800zU<TikTokMediaModel> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526550Kkv(C526590Kkz c526590Kkz, int i, int i2, C259800zU<TikTokMediaModel> c259800zU, InterfaceC1364105Vn<? super C526550Kkv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c526590Kkz;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526550Kkv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumSelectionDataComponent@18aa.swap$2");
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
            C05YC<InterfaceC525940Kjw> c05yc = this.LLILLJJLI.LLILZ;
            final int i2 = this.LLILLL;
            final int i3 = this.LLILZ;
            final TikTokMediaModel tikTokMediaModel = this.LLILZIL.element;
            InterfaceC525940Kjw interfaceC525940Kjw = new InterfaceC525940Kjw(i2, i3, tikTokMediaModel) { // from class: X.0Kjx
                public final int LIZ;
                public final int LIZIZ;
                public final TikTokMediaModel LIZJ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C525950Kjx)) {
                        return false;
                    }
                    C525950Kjx c525950Kjx = (C525950Kjx) obj2;
                    return this.LIZ == c525950Kjx.LIZ && this.LIZIZ == c525950Kjx.LIZIZ && Intrinsics.LJFF(this.LIZJ, c525950Kjx.LIZJ);
                }

                public final int hashCode() {
                    int i4 = ((this.LIZ * 31) + this.LIZIZ) * 31;
                    TikTokMediaModel tikTokMediaModel2 = this.LIZJ;
                    return i4 + (tikTokMediaModel2 == null ? 0 : tikTokMediaModel2.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SwapItem(from=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", to=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", fromModel=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = i2;
                    this.LIZIZ = i3;
                    this.LIZJ = tikTokMediaModel;
                }
            };
            this.LL = 1;
            if (c05yc.emit(interfaceC525940Kjw, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumSelectionDataComponent@18aa.swap$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumSelectionDataComponent@18aa.swap$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
