package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoModuleDTO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1061104Cz {
    public final SeaPdpCreatorVideoModuleDTO LIZ;

    public C1061104Cz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1061104Cz) && Intrinsics.LJFF(this.LIZ, ((C1061104Cz) obj).LIZ);
    }

    public C1061104Cz(SeaPdpCreatorVideoModuleDTO seaPdpCreatorVideoModuleDTO) {
        this.LIZ = seaPdpCreatorVideoModuleDTO;
    }
}
