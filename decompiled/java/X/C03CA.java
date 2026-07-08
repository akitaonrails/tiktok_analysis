package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.AppendixArea;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03CA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CA {
    public final AppendixArea LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C03CA) && Intrinsics.LJFF(this.LIZ, ((C03CA) obj).LIZ);
    }

    public C03CA(AppendixArea appendixArea) {
        this.LIZ = appendixArea;
    }
}
