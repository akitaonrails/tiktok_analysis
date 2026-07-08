package X;

import android.graphics.drawable.AnimatedImageDrawable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0kkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331370kkZ extends AbstractC1327750kej {
    public final ByteBuffer LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public volatile boolean LLJ;
    public final AtomicReference<AnimatedImageDrawable> LLJI;

    @Override // X.InterfaceC1330440kj4
    public final int getImageCount() {
        return 1;
    }

    @Override // X.AbstractC1327750kej
    public final boolean isStateful() {
        return true;
    }

    @Override // X.AbstractC1327750kej, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        AnimatedImageDrawable andSet = this.LLJI.getAndSet(null);
        if (andSet != null) {
            andSet.stop();
            andSet.clearAnimationCallbacks();
        }
    }

    @Override // X.AbstractC1327750kej
    public final int getSizeInBytes() {
        return this.LLIZLLLIL + this.LL.capacity();
    }

    @Override // X.InterfaceC1330440kj4
    public final int getHeight() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1330440kj4
    public final int getWidth() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1327750kej
    public final boolean isClosed() {
        return this.LLJ;
    }

    public C1331370kkZ(ByteBuffer byteBuffer, int i, int i2, int i3, boolean z, int i4, int i5, int i6, AnimatedImageDrawable animatedImageDrawable) {
        this.LL = byteBuffer;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = z;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = i6;
        this.mImageFormat = C1328580kg4.LJIIIZ;
        this.LLJI = new AtomicReference<>(animatedImageDrawable);
    }
}
