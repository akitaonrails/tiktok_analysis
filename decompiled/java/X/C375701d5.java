package X;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01d5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.utils.FileCopyUtilsKt$copySinglePhotoToGallery$2", f = "FileCopyUtils.kt", l = {31}, m = "invokeSuspend")
public final class C375701d5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC376001d8>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C375701d5(String str, boolean z, boolean z2, InterfaceC1364105Vn<? super C375701d5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C375701d5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        C1C7U.LIZ("FileCopyUtilsKt@2056.copySinglePhotoToGallery$2");
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
            Set setLJ = C093Y.LJ(this.LLILLJJLI);
            boolean z = this.LLILLL;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(this.LLILLJJLI, Boolean.valueOf(this.LLILZ)));
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C498201wq(setLJ, z, mapLJIIJ, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FileCopyUtilsKt@2056.copySinglePhotoToGallery$2");
                return objLJFF;
            }
        }
        Set set = (Set) obj;
        if (set != null && set.size() > 0) {
            final Uri uri = (Uri) C13LP.LJJJJZ(set);
            if (uri != null) {
                obj2 = new AbstractC376001d8(uri) { // from class: X.01d7
                    public final Uri LIZ;

                    public final boolean equals(Object obj3) {
                        if (this == obj3) {
                            return true;
                        }
                        return (obj3 instanceof C375901d7) && Intrinsics.LJFF(this.LIZ, ((C375901d7) obj3).LIZ);
                    }

                    public final int hashCode() {
                        Uri uri2 = this.LIZ;
                        if (uri2 == null) {
                            return 0;
                        }
                        return uri2.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Success(contentUri=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = uri;
                    }
                };
            } else {
                obj2 = new AbstractC376001d8() { // from class: X.01d6
                };
            }
            C1C7U.LIZIZ("FileCopyUtilsKt@2056.copySinglePhotoToGallery$2");
            return obj2;
        }
        C375801d6 c375801d6 = new AbstractC376001d8() { // from class: X.01d6
        };
        C1C7U.LIZIZ("FileCopyUtilsKt@2056.copySinglePhotoToGallery$2");
        return c375801d6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC376001d8> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
