package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: X.10eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19299010eq implements Serializable {
    public final Boolean canQuit;
    public final String contentDesc;
    public final Date defaultDate;
    public final Boolean hasAge;
    public final String header;
    public final List<PNSHyperlink> hyperLinks;
    public final String imageUrl;
    public final EnumC19300610f6 indicatorType;
    public final String inputPlaceHolder;
    public final Date lowerBound;
    public final List<PNSNavButton> navButtons;
    public final String nextBtnText;
    public final String title;
    public final Date upperBound;

    public C19299010eq() {
        this(null, null, null, null, null, null, null, null, null, EnumC19300610f6.HIDE, null, null, null, null);
    }

    public C19299010eq(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, EnumC19300610f6 enumC19300610f6, List<PNSNavButton> list, List<PNSHyperlink> list2, Boolean bool, Boolean bool2) {
        this.header = str;
        this.title = str2;
        this.nextBtnText = str3;
        this.contentDesc = str4;
        this.imageUrl = str5;
        this.inputPlaceHolder = str6;
        this.defaultDate = date;
        this.upperBound = date2;
        this.lowerBound = date3;
        this.indicatorType = enumC19300610f6;
        this.navButtons = list;
        this.hyperLinks = list2;
        this.canQuit = bool;
        this.hasAge = bool2;
    }
}
