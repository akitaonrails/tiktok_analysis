package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M46, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftDBExt$getDraftPrimaryKeys$2", f = "DraftDBExt.kt", l = {}, m = "invokeSuspend")
public final class C0M46 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<String>>, Object> {
    public final /* synthetic */ EnumC562220M3g LL;
    public final /* synthetic */ C562260M3k LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M46(EnumC562220M3g enumC562220M3g, C562260M3k c562260M3k, InterfaceC1364105Vn<? super C0M46> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC562220M3g;
        this.LLILLJJLI = c562260M3k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M46(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0064
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            java.lang.String r4 = "DraftDBExt@aed2.getDraftPrimaryKeys$2"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r18)
            com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper r0 = com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper.getInstance()
            android.database.sqlite.SQLiteDatabase r2 = r0.getReadableDatabase()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0M4E r5 = new X.0M4E
            X.0M3e r6 = X.C0M4D.LJ()
            r7 = 0
            r9 = 1
            r0 = r17
            X.0M3g r10 = r0.LL
            X.0M3k r12 = r0.LLILLJJLI
            r14 = 0
            r16 = 934(0x3a6, float:1.309E-42)
            r8 = r7
            r11 = r7
            r13 = r7
            r15 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = X.C0M4D.LIZJ(r5)
            r3 = 0
            android.database.Cursor r2 = r2.rawQuery(r0, r7)
            int r0 = X.C0M4A.LIZ(r2)     // Catch: java.lang.Throwable -> L5c
            if (r0 <= 0) goto L55
        L3f:
            boolean r0 = X.C0M4A.LIZIZ(r2)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L55
            java.lang.String r0 = "video_path"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 < 0) goto L3f
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L5c
            r1.add(r0)     // Catch: java.lang.Throwable -> L5c
            goto L3f
        L55:
            X.C2107108Nh.LIZ(r2, r7)
            X.C1C7U.LIZIZ(r4)
            return r1
        L5c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L64
            throw r1     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            r3 = r1
            goto L65
        L64:
            r0 = move-exception
        L65:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L64
            X.C2107108Nh.LIZ(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M46.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
