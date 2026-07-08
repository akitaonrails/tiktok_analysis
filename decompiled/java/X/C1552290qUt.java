package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0qUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552290qUt {
    public static final ConcurrentHashMap<String, Long> LJ = new ConcurrentHashMap<>();
    public static final AtomicLong LJFF = new AtomicLong(System.currentTimeMillis());
    public final AtomicBoolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final InterfaceC1553530qWt LIZLLL;

    public C1552290qUt(boolean z, boolean z2, String str, C1553070qW9 c1553070qW9) {
        this.LIZ = new AtomicBoolean(z);
        this.LIZIZ = z2;
        this.LIZJ = str;
        this.LIZLLL = c1553070qW9;
    }
}
