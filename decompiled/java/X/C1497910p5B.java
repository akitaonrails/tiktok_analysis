package X;

import Y.ARunnableS28S1100000_23;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0p5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497910p5B implements InterfaceC1497890p59 {
    public final /* synthetic */ C1497900p5A LIZ;

    @Override // X.InterfaceC1497890p59
    public final void run() throws IOException {
        List<String> list;
        if (this.LIZ.LJIIJJI == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String headerField = "http/1.1";
        int i = 0;
        while (true) {
            String headerFieldKey = this.LIZ.LJIIJJI.getHeaderFieldKey(i);
            if (headerFieldKey == null) {
                break;
            }
            if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                headerField = this.LIZ.LJIIJJI.getHeaderField(i);
            }
            if (!headerFieldKey.startsWith("X-Android")) {
                arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.LIZ.LJIIJJI.getHeaderField(i)));
            }
            i++;
        }
        int responseCode = this.LIZ.LJIIJJI.getResponseCode();
        this.LIZ.LJIIIZ = new C1497220p44(new ArrayList(this.LIZ.LIZIZ), responseCode, this.LIZ.LJIIJJI.getResponseMessage(), Collections.unmodifiableList(arrayList), false, headerField, "", 0L);
        if (responseCode >= 300 && responseCode < 400 && (list = this.LIZ.LJIIIZ.LIZ().get("location")) != null) {
            C1497900p5A c1497900p5A = this.LIZ;
            String str = (String) ListProtector.get(list, 0);
            c1497900p5A.getClass();
            c1497900p5A.LJJIFFI(1, 2, new ARunnableS28S1100000_23(c1497900p5A, str, 9));
            return;
        }
        this.LIZ.LJJI();
        if (responseCode >= 400) {
            final InputStream errorStream = this.LIZ.LJIIJJI.getErrorStream();
            this.LIZ.LJIIIIZZ = errorStream != null ? errorStream instanceof FileInputStream ? ((FileInputStream) errorStream).getChannel() : new ReadableByteChannel(errorStream) { // from class: X.08eY
                public final InputStream LL;
                public final AtomicBoolean LLILLJJLI = new AtomicBoolean(true);

                @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    if (this.LLILLJJLI.compareAndSet(true, false)) {
                        this.LL.close();
                    }
                }

                @Override // java.nio.channels.Channel
                public final boolean isOpen() {
                    return this.LLILLJJLI.get();
                }

                {
                    this.LL = errorStream;
                }

                @Override // java.nio.channels.ReadableByteChannel
                public final int read(ByteBuffer byteBuffer) throws IOException {
                    int i2;
                    if (byteBuffer.hasArray()) {
                        i2 = this.LL.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                        if (i2 > 0) {
                            byteBuffer.position(byteBuffer.position() + i2);
                        }
                    } else {
                        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.LL.available(), SpeechEngineDefines.TTS_WORK_MODE_BOTH), byteBuffer.remaining()))];
                        i2 = this.LL.read(bArr);
                        if (i2 > 0) {
                            byteBuffer.put(bArr, 0, i2);
                            return i2;
                        }
                    }
                    return i2;
                }
            } : null;
            this.LIZ.getClass();
            throw null;
        }
        C1497900p5A c1497900p5A2 = this.LIZ;
        final InputStream inputStream = c1497900p5A2.LJIIJJI.getInputStream();
        c1497900p5A2.LJIIIIZZ = inputStream instanceof FileInputStream ? ((FileInputStream) inputStream).getChannel() : new ReadableByteChannel(inputStream) { // from class: X.08eY
            public final InputStream LL;
            public final AtomicBoolean LLILLJJLI = new AtomicBoolean(true);

            @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                if (this.LLILLJJLI.compareAndSet(true, false)) {
                    this.LL.close();
                }
            }

            @Override // java.nio.channels.Channel
            public final boolean isOpen() {
                return this.LLILLJJLI.get();
            }

            {
                this.LL = inputStream;
            }

            @Override // java.nio.channels.ReadableByteChannel
            public final int read(ByteBuffer byteBuffer) throws IOException {
                int i2;
                if (byteBuffer.hasArray()) {
                    i2 = this.LL.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                    if (i2 > 0) {
                        byteBuffer.position(byteBuffer.position() + i2);
                    }
                } else {
                    byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.LL.available(), SpeechEngineDefines.TTS_WORK_MODE_BOTH), byteBuffer.remaining()))];
                    i2 = this.LL.read(bArr);
                    if (i2 > 0) {
                        byteBuffer.put(bArr, 0, i2);
                        return i2;
                    }
                }
                return i2;
            }
        };
        this.LIZ.getClass();
        throw null;
    }

    public C1497910p5B(C1497900p5A c1497900p5A) {
        this.LIZ = c1497900p5A;
    }
}
