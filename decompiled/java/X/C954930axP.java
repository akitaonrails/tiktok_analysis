package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import java.util.List;

/* JADX INFO: renamed from: X.0axP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954930axP {
    public final List<C954460awe> LIZ;
    public final String LIZIZ;
    public final CustomLinkMessage LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final List<C936770aU7> LJFF;
    public final BusinessContent LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C954930axP(List list, String str, List list2, BusinessContent businessContent, int i) {
        boolean z;
        BusinessContent businessContent2 = businessContent;
        List list3 = list2;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(list, str, z, false, (i & 32) != 0 ? C13BV.INSTANCE : list3, (i & 64) != 0 ? null : businessContent2);
    }

    public C954930axP(List list, String str, boolean z, boolean z2, List list2, BusinessContent businessContent) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = null;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = list2;
        this.LJI = businessContent;
    }
}
