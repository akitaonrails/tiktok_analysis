package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0giz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176630giz implements Serializable {
    public final PoiGeneralCard card;
    public final EnumC994790bzh degradeStrategy;
    public final EnumC1153700g80 uiStyle;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176630giz)) {
            return false;
        }
        C1176630giz c1176630giz = (C1176630giz) obj;
        return Intrinsics.LJFF(this.card, c1176630giz.card) && this.uiStyle == c1176630giz.uiStyle && this.degradeStrategy == c1176630giz.degradeStrategy;
    }

    public C1176630giz(PoiGeneralCard poiGeneralCard, EnumC1153700g80 enumC1153700g80, EnumC994790bzh enumC994790bzh) {
        this.card = poiGeneralCard;
        this.uiStyle = enumC1153700g80;
        this.degradeStrategy = enumC994790bzh;
    }
}
