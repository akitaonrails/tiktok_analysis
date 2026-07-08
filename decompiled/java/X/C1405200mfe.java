package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405200mfe {
    public final String LIZ = "WaveUploadVideoTask";
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405200mfe)) {
            return false;
        }
        C1405200mfe c1405200mfe = (C1405200mfe) obj;
        return Intrinsics.LJFF(this.LIZ, c1405200mfe.LIZ) && this.LIZIZ == c1405200mfe.LIZIZ;
    }

    public C1405200mfe(int i) {
        this.LIZIZ = i;
    }
}
