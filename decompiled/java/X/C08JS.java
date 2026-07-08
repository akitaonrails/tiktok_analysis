package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.internal.w;
import com.google.gson.k;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.08JS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JS {
    public static Gson LIZ;

    public static Gson LIZIZ() {
        if (LIZ == null) {
            LIZ = new Gson();
        }
        return LIZ;
    }

    public static String LIZLLL(Object obj) {
        return GsonProtectorUtils.toJson(LIZIZ(), obj);
    }

    public static <T> T LIZ(String str, Class<T> cls) {
        return (T) GsonProtectorUtils.fromJson(LIZIZ(), str, (Class) cls);
    }

    public static String LIZJ(int i, k kVar) {
        try {
            StringWriter stringWriter = new StringWriter(i);
            C09DL c09dl = new C09DL(stringWriter);
            c09dl.LLILZLL = true;
            w.LIZIZ(kVar, c09dl);
            return stringWriter.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public static List LJ(Class cls, String str) {
        Object[] objArr = (Object[]) GsonProtectorUtils.fromJson(LIZIZ(), str, cls);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }

    public static String LJFF(k kVar, C08JT c08jt, final int i) {
        Writer stringWriter;
        try {
            if (c08jt == C08JT.OPT_BUILDER) {
                stringWriter = new C2096008Ja(i);
            } else if (c08jt == C08JT.CHAR_ARRAY) {
                stringWriter = new Writer(i) { // from class: X.08JV
                    public char[] LL;
                    public int LLILLJJLI;

                    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                    }

                    @Override // java.io.Writer, java.io.Flushable
                    public final void flush() {
                    }

                    public final String toString() {
                        return new String(this.LL, 0, this.LLILLJJLI);
                    }

                    {
                        if (i >= 0) {
                            this.LL = new char[i];
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Negative initial size: ");
                        sbLIZ.append(i);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // java.io.Writer, java.lang.Appendable
                    public final Writer append(CharSequence charSequence) {
                        String string;
                        if (charSequence == null) {
                            string = "null";
                        } else {
                            string = charSequence.toString();
                        }
                        write(string, 0, string.length());
                        return this;
                    }

                    @Override // java.io.Writer
                    public final void write(int i2) {
                        int i3 = this.LLILLJJLI + 1;
                        char[] cArr = this.LL;
                        if (i3 > cArr.length) {
                            this.LL = Arrays.copyOf(cArr, Math.max(cArr.length << 1, i3));
                        }
                        this.LL[this.LLILLJJLI] = (char) i2;
                        this.LLILLJJLI = i3;
                    }

                    @Override // java.io.Writer, java.lang.Appendable
                    public final Appendable append(CharSequence charSequence) {
                        String string;
                        if (charSequence == null) {
                            string = "null";
                        } else {
                            string = charSequence.toString();
                        }
                        write(string, 0, string.length());
                        return this;
                    }

                    @Override // java.io.Writer, java.lang.Appendable
                    public final Writer append(char c) {
                        write(c);
                        return this;
                    }

                    @Override // java.io.Writer, java.lang.Appendable
                    public final Appendable append(char c) {
                        write(c);
                        return this;
                    }

                    @Override // java.io.Writer, java.lang.Appendable
                    public final Writer append(CharSequence charSequence, int i2, int i3) {
                        if (charSequence == null) {
                            charSequence = "null";
                        }
                        String string = charSequence.subSequence(i2, i3).toString();
                        write(string, 0, string.length());
                        return this;
                    }

                    @Override // java.io.Writer
                    public final void write(char[] cArr, int i2, int i3) {
                        int i4;
                        if (i2 >= 0 && i2 <= cArr.length && i3 >= 0 && (i4 = i2 + i3) <= cArr.length && i4 >= 0) {
                            if (i3 == 0) {
                                return;
                            }
                            int i5 = this.LLILLJJLI + i3;
                            char[] cArr2 = this.LL;
                            if (i5 > cArr2.length) {
                                this.LL = Arrays.copyOf(cArr2, Math.max(cArr2.length << 1, i5));
                            }
                            System.arraycopy(cArr, i2, this.LL, this.LLILLJJLI, i3);
                            this.LLILLJJLI = i5;
                            return;
                        }
                        throw new IndexOutOfBoundsException();
                    }

                    @Override // java.io.Writer, java.lang.Appendable
                    public final Appendable append(CharSequence charSequence, int i2, int i3) {
                        if (charSequence == null) {
                            charSequence = "null";
                        }
                        String string = charSequence.subSequence(i2, i3).toString();
                        write(string, 0, string.length());
                        return this;
                    }

                    @Override // java.io.Writer
                    public final void write(String str, int i2, int i3) {
                        int i4 = this.LLILLJJLI + i3;
                        char[] cArr = this.LL;
                        if (i4 > cArr.length) {
                            this.LL = Arrays.copyOf(cArr, Math.max(cArr.length << 1, i4));
                        }
                        str.getChars(i2, i3 + i2, this.LL, this.LLILLJJLI);
                        this.LLILLJJLI = i4;
                    }
                };
            } else {
                stringWriter = new StringWriter(i);
            }
            C09DL c09dl = new C09DL(stringWriter);
            c09dl.LLILZLL = true;
            w.LIZIZ(kVar, c09dl);
            return stringWriter.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }
}
