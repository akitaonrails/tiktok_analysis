package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ldM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365340ldM {
    public EnumC1365370ldP LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<IMContact> LIZLLL;
    public final String LJ;
    public final SharePackage LJFF;
    public final BaseContent LJI;
    public final BaseTemplate LJII;
    public final Map<String, String> LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public final Map<String, String> LJIIJ;
    public final String LJIIJJI;
    public final InterfaceC1361990lXx LJIIL;
    public final InterfaceC1362600lYw LJIILIIL;
    public final List<RichTextInfo> LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1365340ldM)) {
            return false;
        }
        C1365340ldM c1365340ldM = (C1365340ldM) obj;
        return this.LIZ == c1365340ldM.LIZ && Intrinsics.LJFF(this.LIZIZ, c1365340ldM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1365340ldM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1365340ldM.LIZLLL) && Intrinsics.LJFF(this.LJ, c1365340ldM.LJ) && Intrinsics.LJFF(this.LJFF, c1365340ldM.LJFF) && Intrinsics.LJFF(this.LJI, c1365340ldM.LJI) && Intrinsics.LJFF(this.LJII, c1365340ldM.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1365340ldM.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1365340ldM.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1365340ldM.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1365340ldM.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1365340ldM.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1365340ldM.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1365340ldM.LJIILJJIL);
    }

    public /* synthetic */ C1365340ldM(EnumC1365370ldP enumC1365370ldP, String str, String str2, List list, SharePackage sharePackage, TextContent textContent, BaseTemplate baseTemplate, Map map, Map map2, String str3, InterfaceC1361990lXx interfaceC1361990lXx) {
        this(enumC1365370ldP, str, str2, list, "", sharePackage, textContent, baseTemplate, map, map2, null, str3, interfaceC1361990lXx, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1365340ldM(EnumC1365370ldP enumC1365370ldP, String str, String str2, List<? extends IMContact> list, String str3, SharePackage sharePackage, BaseContent baseContent, BaseTemplate baseTemplate, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str4, InterfaceC1361990lXx interfaceC1361990lXx, InterfaceC1362600lYw interfaceC1362600lYw, List<RichTextInfo> list2) {
        this.LIZ = enumC1365370ldP;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = list;
        this.LJ = str3;
        this.LJFF = sharePackage;
        this.LJI = baseContent;
        this.LJII = baseTemplate;
        this.LJIIIIZZ = map;
        this.LJIIIZ = map2;
        this.LJIIJ = map3;
        this.LJIIJJI = str4;
        this.LJIIL = interfaceC1361990lXx;
        this.LJIILIIL = interfaceC1362600lYw;
        this.LJIILJJIL = list2;
    }
}
