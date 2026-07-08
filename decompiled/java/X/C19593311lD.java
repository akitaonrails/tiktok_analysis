package X;

import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkShareFormat;

/* JADX INFO: renamed from: X.11lD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19593311lD {
    public static AttributionLinkShareFormat LIZ(Integer num) {
        for (AttributionLinkShareFormat attributionLinkShareFormat : AttributionLinkShareFormat.values()) {
            int value = attributionLinkShareFormat.getValue();
            if (num != null && value == num.intValue()) {
                return attributionLinkShareFormat;
            }
        }
        return AttributionLinkShareFormat.ATTRIBUTION_LINK_SHARE_FORMAT_UNKNOWN;
    }
}
