package com.bytedance.android.live.base.model.user;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeText {

    @C09CT("default_pattern")
    public String defaultPattern;

    @C09CT("key")
    public String key;

    @C09CT("pieces")
    public List<String> pieces;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.defaultPattern != null) {
            sb.append(", default_pattern=");
            sb.append(this.defaultPattern);
        }
        List<String> list = this.pieces;
        if (list != null && !list.isEmpty()) {
            sb.append(", pieces=");
            sb.append(this.pieces);
        }
        sb.replace(0, 2, "BadgeText{");
        sb.append('}');
        return sb.toString();
    }
}
