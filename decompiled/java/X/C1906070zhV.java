package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906070zhV implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final Boolean LLILLJJLI;
    public final Long LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;
    public final AwemeDraft LLIZ;
    public final EnumC492500JTc LLIZLLLIL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyVideoItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAuthor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", firstDraft=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        AwemeDraft awemeDraft;
        C1906070zhV c1906070zhV;
        Aweme aweme;
        if (interfaceC1891350zJl instanceof C1906070zhV) {
            Aweme aweme2 = this.LL;
            if (aweme2 != null && (aweme = (c1906070zhV = (C1906070zhV) interfaceC1891350zJl).LL) != null) {
                if (aweme2 == null || aweme == null || !Intrinsics.LJFF(aweme2.getAid(), c1906070zhV.LL.getAid()) || AwemeBizExtKt.isAttrUpdated(this.LL) != AwemeBizExtKt.isAttrUpdated(c1906070zhV.LL)) {
                    return false;
                }
                return true;
            }
            AwemeDraft awemeDraft2 = this.LLIZ;
            if (awemeDraft2 != null && (awemeDraft = ((C1906070zhV) interfaceC1891350zJl).LLIZ) != null) {
                return Intrinsics.LJFF(awemeDraft2, awemeDraft);
            }
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1906070zhV) {
            C1906070zhV c1906070zhV = (C1906070zhV) obj;
            if (Intrinsics.LJFF(this.LL, c1906070zhV.LL) && Intrinsics.LJFF(this.LLIZ, c1906070zhV.LLIZ)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1906070zhV(Aweme aweme, Boolean bool, Long l, String str, String str2, Integer num, AwemeDraft awemeDraft, EnumC492500JTc enumC492500JTc) {
        this.LL = aweme;
        this.LLILLJJLI = bool;
        this.LLILLL = l;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = num;
        this.LLIZ = awemeDraft;
        this.LLIZLLLIL = enumC492500JTc;
    }
}
