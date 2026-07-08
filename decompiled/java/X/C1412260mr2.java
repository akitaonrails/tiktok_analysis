package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412260mr2 extends C09AY implements Function1<C1412800mru, Boolean> {
    public final /* synthetic */ MixEditingMaterialType LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412260mr2(MixEditingMaterialType mixEditingMaterialType, String str, String str2) {
        super(1);
        this.LL = mixEditingMaterialType;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C1412800mru c1412800mru) {
        boolean z;
        String resource_id;
        BusinessExtra business_extra;
        C1412800mru c1412800mru2 = c1412800mru;
        MixEditingMaterialType mixEditingMaterialType = this.LL;
        if (mixEditingMaterialType == MixEditingMaterialType.LYRICS_RULE_TEMPLATE) {
            if (c1412800mru2.LIZ == mixEditingMaterialType) {
                if (!Intrinsics.LJFF(c1412800mru2.LIZIZ(), this.LLILLJJLI)) {
                    Asset asset = c1412800mru2.LIZLLL;
                    String music_id = null;
                    if (asset != null) {
                        resource_id = asset.getResource_id();
                    } else {
                        resource_id = null;
                    }
                    if (!Intrinsics.LJFF(resource_id, this.LLILLJJLI)) {
                        if (this.LLILLL != null) {
                            Asset asset2 = c1412800mru2.LIZLLL;
                            if (asset2 != null && (business_extra = asset2.getBusiness_extra()) != null) {
                                music_id = business_extra.getMusic_id();
                            }
                            if (Intrinsics.LJFF(music_id, this.LLILLL)) {
                            }
                        }
                    }
                }
                z = true;
            }
            z = false;
        } else if (Intrinsics.LJFF(c1412800mru2.LIZIZ(), this.LLILLJJLI) && c1412800mru2.LIZ == this.LL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
