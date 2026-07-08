package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.album.EPTrackFramePreLoader$startPreLoadTrackThumbnail$1", f = "EPTrackFramePreLoader.kt", l = {61, 65}, m = "invokeSuspend")
public final class C23243098v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<MediaModel> LLILLJJLI;
    public final /* synthetic */ ConcurrentHashMap<C370820EgK, Bitmap> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23243098v(Context context, List list, ConcurrentHashMap concurrentHashMap, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = concurrentHashMap;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23243098v(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EPTrackFramePreLoader@eff7.startPreLoadTrackThumbnail$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            java.lang.String r3 = "EPTrackFramePreLoader"
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L3d
            if (r0 == r4) goto L59
            if (r0 != r5) goto L7b
            X.C155000ia.LIZIZ(r9)
        L18:
            java.util.List r9 = (java.util.List) r9
        L1a:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L37
            X.0M8t r2 = X.C563650M8t.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "no cache Path:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r3, r0)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L3d:
            X.C155000ia.LIZIZ(r9)
            X.0M8t r1 = X.C563650M8t.LIZIZ
            java.lang.String r0 = "startPreLoadTrackThumbnail"
            X.C201955140j.LIZLLL(r1, r3, r0)
            X.098x r2 = X.C23245098x.LIZ
            java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r1 = r8.LLILLJJLI
            java.util.concurrent.ConcurrentHashMap<X.0EgK, android.graphics.Bitmap> r0 = r8.LLILLL
            r8.LL = r4
            java.lang.Object r9 = r2.LIZIZ(r1, r0, r8)
            if (r9 != r6) goto L5c
            X.C1C7U.LIZIZ(r7)
            return r6
        L59:
            X.C155000ia.LIZIZ(r9)
        L5c:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L78
            X.098x r2 = X.C23245098x.LIZ
            android.content.Context r1 = r8.LLILZ
            java.util.concurrent.ConcurrentHashMap<X.0EgK, android.graphics.Bitmap> r0 = r8.LLILLL
            r8.LL = r5
            java.lang.Object r9 = r2.LIZ(r1, r9, r0, r8)
            if (r9 != r6) goto L18
            X.C1C7U.LIZIZ(r7)
            return r6
        L78:
            X.13BV r9 = X.C13BV.INSTANCE
            goto L1a
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23243098v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
