package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.tiktok.json.gson.cpp.GsonNative;
import java.io.Writer;

/* JADX INFO: renamed from: X.08JX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JX extends Writer {
    public final char[] LL = new char[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
    public final long LLILLJJLI;
    public final int LLILLL;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i) {
        GsonNative.writeInt(this.LLILLJJLI, i);
    }

    public C08JX(long j, int i) {
        this.LLILLL = i;
        this.LLILLJJLI = j;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= cArr.length && i2 >= 0 && (i3 = i + i2) <= cArr.length && i3 >= 0) {
            if (i2 == 0) {
                return;
            }
            GsonNative.writeCharArray(this.LLILLJJLI, cArr, i, i2);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        char[] cArr;
        if (i2 <= this.LLILLL) {
            cArr = this.LL;
        } else {
            cArr = new char[i2];
        }
        str.getChars(i, i + i2, cArr, 0);
        write(cArr, 0, i2);
    }
}
