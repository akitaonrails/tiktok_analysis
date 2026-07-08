package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.098Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.facedetection.AlbumFaceDetectionComponent$detectFace$2", f = "AlbumFaceDetectionComponent.kt", l = {}, m = "invokeSuspend")
public final class C098Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C23222098a LL;
    public final /* synthetic */ MediaModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098Z(C23222098a c23222098a, MediaModel mediaModel, InterfaceC1364105Vn<? super C098Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c23222098a;
        this.LLILLJJLI = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C098Z(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC23225098d enumC23225098dLIZ;
        boolean z;
        C1C7U.LIZ("AlbumFaceDetectionComponent@a025.detectFace$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2497109qT.LIZ.getClass();
        C2497109qT.LIZIZ.await();
        ConcurrentHashMap<C12838050q, Boolean> concurrentHashMap = this.LL.LLILLJJLI;
        MediaModel mediaModel = this.LLILLJJLI;
        Object obj2 = new Object(mediaModel.id, mediaModel.modify) { // from class: X.050q
            public final String LIZ;
            public final long LIZIZ;

            public final boolean equals(Object obj3) {
                if (this == obj3) {
                    return true;
                }
                if (!(obj3 instanceof C12838050q)) {
                    return false;
                }
                C12838050q c12838050q = (C12838050q) obj3;
                return Intrinsics.LJFF(this.LIZ, c12838050q.LIZ) && this.LIZIZ == c12838050q.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Key(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", modifyTime=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = j;
            }
        };
        Boolean boolValueOf = concurrentHashMap.get(obj2);
        if (boolValueOf == null) {
            Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(C2471909mP.LJIJ(mediaModel), null);
            if (bitmapLIZLLL == null) {
                enumC23225098dLIZ = EnumC23225098d.DECODE_FAIL;
            } else {
                enumC23225098dLIZ = C2497109qT.LIZ(bitmapLIZLLL);
            }
            if (enumC23225098dLIZ == EnumC23225098d.HAS_FACE) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            Boolean boolPutIfAbsent = concurrentHashMap.putIfAbsent((C12838050q) obj2, boolValueOf);
            if (boolPutIfAbsent != null) {
                boolValueOf = boolPutIfAbsent;
            }
        }
        C1C7U.LIZIZ("AlbumFaceDetectionComponent@a025.detectFace$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
