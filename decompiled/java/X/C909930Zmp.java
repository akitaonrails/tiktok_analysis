package X;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909930Zmp {
    public final C869590Y9l LIZ;

    public final int hashCode() {
        C869590Y9l c869590Y9l = this.LIZ;
        if (c869590Y9l != null) {
            return c869590Y9l.hashCode();
        }
        return 0;
    }

    public C909930Zmp(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }

    public final boolean equals(Object obj) {
        String uuid;
        String uuid2;
        String content;
        String content2;
        ByteString contentPB;
        ByteString contentPB2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf5;
        if (!(obj instanceof C909930Zmp)) {
            return false;
        }
        C909930Zmp c909930Zmp = (C909930Zmp) obj;
        C869590Y9l c869590Y9l = c909930Zmp.LIZ;
        Long lValueOf6 = null;
        if (c869590Y9l != null) {
            uuid = c869590Y9l.getUuid();
        } else {
            uuid = null;
        }
        C869590Y9l c869590Y9l2 = this.LIZ;
        if (c869590Y9l2 != null) {
            uuid2 = c869590Y9l2.getUuid();
        } else {
            uuid2 = null;
        }
        if (!Intrinsics.LJFF(uuid, uuid2)) {
            return false;
        }
        C869590Y9l c869590Y9l3 = c909930Zmp.LIZ;
        if (c869590Y9l3 != null) {
            content = c869590Y9l3.getContent();
        } else {
            content = null;
        }
        C869590Y9l c869590Y9l4 = this.LIZ;
        if (c869590Y9l4 != null) {
            content2 = c869590Y9l4.getContent();
        } else {
            content2 = null;
        }
        if (!Intrinsics.LJFF(content, content2)) {
            return false;
        }
        C869590Y9l c869590Y9l5 = c909930Zmp.LIZ;
        if (c869590Y9l5 != null) {
            contentPB = c869590Y9l5.getContentPB();
        } else {
            contentPB = null;
        }
        C869590Y9l c869590Y9l6 = this.LIZ;
        if (c869590Y9l6 != null) {
            contentPB2 = c869590Y9l6.getContentPB();
        } else {
            contentPB2 = null;
        }
        if (!Intrinsics.LJFF(contentPB, contentPB2)) {
            return false;
        }
        C869590Y9l c869590Y9l7 = c909930Zmp.LIZ;
        if (c869590Y9l7 != null) {
            lValueOf = Long.valueOf(c869590Y9l7.getMsgId());
        } else {
            lValueOf = null;
        }
        C869590Y9l c869590Y9l8 = this.LIZ;
        if (c869590Y9l8 != null) {
            lValueOf2 = Long.valueOf(c869590Y9l8.getMsgId());
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return false;
        }
        C869590Y9l c869590Y9l9 = c909930Zmp.LIZ;
        if (c869590Y9l9 != null) {
            lValueOf3 = Long.valueOf(c869590Y9l9.getIndex());
        } else {
            lValueOf3 = null;
        }
        C869590Y9l c869590Y9l10 = this.LIZ;
        if (c869590Y9l10 != null) {
            lValueOf4 = Long.valueOf(c869590Y9l10.getIndex());
        } else {
            lValueOf4 = null;
        }
        if (!Intrinsics.LJFF(lValueOf3, lValueOf4)) {
            return false;
        }
        C869590Y9l c869590Y9l11 = c909930Zmp.LIZ;
        if (c869590Y9l11 != null) {
            numValueOf = Integer.valueOf(c869590Y9l11.getMsgStatus());
        } else {
            numValueOf = null;
        }
        C869590Y9l c869590Y9l12 = this.LIZ;
        if (c869590Y9l12 != null) {
            numValueOf2 = Integer.valueOf(c869590Y9l12.getMsgStatus());
        } else {
            numValueOf2 = null;
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return false;
        }
        C869590Y9l c869590Y9l13 = c909930Zmp.LIZ;
        if (c869590Y9l13 != null) {
            lValueOf5 = Long.valueOf(c869590Y9l13.getCreatedAt());
        } else {
            lValueOf5 = null;
        }
        C869590Y9l c869590Y9l14 = this.LIZ;
        if (c869590Y9l14 != null) {
            lValueOf6 = Long.valueOf(c869590Y9l14.getCreatedAt());
        }
        if (!Intrinsics.LJFF(lValueOf5, lValueOf6)) {
            return false;
        }
        return true;
    }
}
