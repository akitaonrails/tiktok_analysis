package X;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0p5K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498000p5K extends AbstractC1497970p5H {
    public final HttpURLConnection LJII;
    public final AtomicBoolean LJIIIIZZ;
    public WritableByteChannel LJIIIZ;
    public OutputStream LJIIJ;
    public final /* synthetic */ C1497900p5A LJIIJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1498000p5K(C1497900p5A c1497900p5A, Executor executor, ExecutorC1498050p5P executorC1498050p5P, HttpURLConnection httpURLConnection, C1497950p5F c1497950p5F) {
        super(executor, executorC1498050p5P, c1497950p5F);
        this.LJIIJJI = c1497900p5A;
        this.LJIIIIZZ = new AtomicBoolean(false);
        this.LJII = httpURLConnection;
    }
}
