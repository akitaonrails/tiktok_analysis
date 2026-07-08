package X;

import com.lynx.react.bridge.mapbuffer.ReadableMapBuffer;
import com.lynx.react.bridge.mapbuffer.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312820kGe implements Iterator<C1312830kGf> {
    public int LL;
    public final int LLILLJJLI;
    public final /* synthetic */ d LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0kGf] */
    @Override // java.util.Iterator
    public final C1312830kGf next() {
        final d dVar = this.LLILLL;
        int i = this.LL;
        this.LL = i + 1;
        final int iLIZJ = dVar.LIZJ(i);
        return new InterfaceC1312510kG9(iLIZJ) { // from class: X.0kGf
            public final int LIZ;

            @Override // X.InterfaceC1312510kG9, X.InterfaceC1311710kEr
            public final double LIZ() {
                d dVar2 = this.LIZIZ;
                return dVar2.LL.getDouble(this.LIZ + dVar2.LLILLL);
            }

            @Override // X.InterfaceC1312510kG9
            public final ReadableMapBuffer LIZIZ() {
                d dVar2 = this.LIZIZ;
                return new ReadableMapBuffer(-1, ByteBuffer.wrap(dVar2.LJ(this.LIZ + dVar2.LLILLL)));
            }

            @Override // X.InterfaceC1311710kEr
            public final long LJ() {
                d dVar2 = this.LIZIZ;
                return dVar2.LL.getLong(this.LIZ + dVar2.LLILLL);
            }

            @Override // X.InterfaceC1311710kEr
            public final int LJFF() {
                d dVar2 = this.LIZIZ;
                return dVar2.LL.getInt(this.LIZ + dVar2.LLILLL);
            }

            @Override // X.InterfaceC1312510kG9
            public final int getKey() {
                d dVar2 = this.LIZIZ;
                return dVar2.LL.getShort(this.LIZ);
            }

            @Override // X.InterfaceC1311710kEr
            public final String getString() {
                d dVar2 = this.LIZIZ;
                return new String(dVar2.LJ(this.LIZ + dVar2.LLILLL), Charset.defaultCharset());
            }

            {
                this.LIZ = iLIZJ;
            }
        };
    }

    public C1312820kGe(d dVar) {
        this.LLILLL = dVar;
        this.LLILLJJLI = dVar.LLILLJJLI;
    }
}
