package X;

import com.ss.lyrax.video.ILyraxVideoRendererFactory;

/* JADX INFO: renamed from: X.0jHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275000jHe implements ILyraxVideoRendererFactory {
    public final /* synthetic */ C1275200jHy LIZ;
    public final /* synthetic */ C1274810jHL LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // com.ss.lyrax.video.ILyraxVideoRendererFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.lyrax.video.ILyraxVideoRenderer createVideoRenderer(java.lang.String r7) {
        /*
            r6 = this;
            r4 = 0
            if (r7 != 0) goto L3d
            r5 = 0
        L4:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L6a
            java.lang.String r2 = "ClientImpl"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "LyraxRendererFactory invoked with unparsable renderId="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.ttlivestreamer.core.utils.AVLog.ioe(r2, r0)
            com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper r1 = new com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper
            X.0jHy r0 = r6.LIZ
            r1.<init>(r0)
            X.0jHL r0 = r6.LIZIZ
            android.view.View r0 = r0.LJL()
            if (r0 == 0) goto L31
            r1.setRenderTargetView(r0)
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L3c
            X.0jHL r0 = r6.LIZIZ
            r0.LJJIIJZLJL(r7, r1)
        L3c:
            return r1
        L3d:
            r0 = 95
            int r2 = r7.lastIndexOf(r0)
            if (r2 <= 0) goto L68
            int r0 = r7.length()
            int r0 = r0 + (-1)
            if (r2 >= r0) goto L68
            int r0 = r2 + 1
            java.lang.String r0 = r7.substring(r0)     // Catch: java.lang.NumberFormatException -> L64
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L64
            com.ss.bytertc.engine.data.StreamIndex r0 = com.ss.bytertc.engine.data.StreamIndex.STREAM_INDEX_MAIN     // Catch: java.lang.NumberFormatException -> L64
            int r0 = r0.value()     // Catch: java.lang.NumberFormatException -> L64
            if (r1 != r0) goto L68
            java.lang.String r5 = r7.substring(r4, r2)     // Catch: java.lang.NumberFormatException -> L64
            goto L4
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L68:
            r5 = r7
            goto L4
        L6a:
            X.0jHL r0 = r6.LIZIZ
            com.ss.bytertc.engine.data.StreamKey r1 = r0.LLIFFJFJJ(r7)
            com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper r3 = new com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper
            X.0jHy r0 = r6.LIZ
            r3.<init>(r0)
            X.0jHW r0 = new X.0jHW
            r0.<init>(r6, r1)
            monitor-enter(r3)
            r3.LJJI = r0     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r3)
            X.0jHL r0 = r6.LIZIZ
            r0.LJIL(r1, r3)
            X.0jHL r0 = r6.LIZIZ
            X.0jHx r2 = r0.LJLI(r5, r4)
            X.0jHL r1 = r6.LIZIZ
            r0 = 1
            X.0jHx r0 = r1.LJLI(r5, r0)
            r3.LJIIIZ(r2, r0)
            X.0jHL r0 = r6.LIZIZ
            X.0jGR r0 = r0.LIZJ
            X.0jFs r0 = r0.LIZ()
            if (r0 == 0) goto La6
            boolean r0 = r0.LLJIJIL()
            if (r0 == 0) goto La6
            r4 = 1
        La6:
            r3.LJIJJLI = r4
            X.0jHx r0 = r3.LJIIIIZZ()
            r3.LJII(r0)
            r3.LJIIJJI()
            X.0jHL r0 = r6.LIZIZ
            android.view.View r0 = r0.LJL()
            if (r0 == 0) goto Lbd
            r3.setRenderTargetView(r0)
        Lbd:
            X.0jHL r0 = r6.LIZIZ
            r0.LJJIIJZLJL(r7, r3)
            return r3
        Lc3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1275000jHe.createVideoRenderer(java.lang.String):com.ss.lyrax.video.ILyraxVideoRenderer");
    }

    public C1275000jHe(C1274810jHL c1274810jHL, C1275200jHy c1275200jHy) {
        this.LIZIZ = c1274810jHL;
        this.LIZ = c1275200jHy;
    }
}
