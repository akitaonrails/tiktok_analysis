package X;

import android.os.Build;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8W, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8W implements Serializable {
    public static String TAG = "ConversationSettingInfo";
    public ByteString bizSettingPersistentExtra;
    public int category;
    public String conversationId;
    public Set<String> conversationTags;
    public String conversationTagsStr;
    public Map<String, String> ext;
    public String extString;
    public int favor;
    public int mute;
    public long setFavoriteTime;
    public long setTopTime;
    public int stickTop;
    public long version;

    public synchronized Set<String> getConversationTags() {
        String str;
        Set<String> set = this.conversationTags;
        if ((set == null || set.isEmpty()) && (str = this.conversationTagsStr) != null && !str.isEmpty()) {
            this.conversationTags = new HashSet(Arrays.asList(this.conversationTagsStr.split(",")));
        }
        if (this.conversationTags == null) {
            this.conversationTags = new HashSet();
        }
        return this.conversationTags;
    }

    public synchronized Map<String, String> getExt() {
        if (this.ext == null) {
            String str = this.extString;
            if (str == null) {
                this.ext = new HashMap();
            } else {
                setExtStr(str);
                this.extString = null;
                if (this.ext == null) {
                    this.ext = new HashMap();
                }
            }
        }
        return this.ext;
    }

    public String getExtStr() {
        return C09EF.LIZ(this.ext);
    }

    public boolean isFavor() {
        return this.favor == 1;
    }

    public boolean isMute() {
        return this.mute == 1;
    }

    public boolean isStickTop() {
        return this.stickTop == 1;
    }

    public ByteString getBizSettingPersistentExtraRaw() {
        return this.bizSettingPersistentExtra;
    }

    public int getCategory() {
        return this.category;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getConversationTagsStr() {
        return this.conversationTagsStr;
    }

    public int getFavor() {
        return this.favor;
    }

    public int getMute() {
        return this.mute;
    }

    public long getSetFavoriteTime() {
        return this.setFavoriteTime;
    }

    public long getSetTopTime() {
        return this.setTopTime;
    }

    public int getStickTop() {
        return this.stickTop;
    }

    public long getVersion() {
        return this.version;
    }

    public String optGetExtStr() {
        return this.extString;
    }

    public void optSetExtStr(String str) {
        this.extString = str;
    }

    public void setBizSettingPersistentExtraRaw(ByteString byteString) {
        this.bizSettingPersistentExtra = byteString;
    }

    public void setCategory(int i) {
        this.category = i;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationTags(Set<String> set) {
        if (set != null && !Objects.equals(this.conversationTags, set)) {
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it2 = set.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ",");
                        }
                    }
                }
                this.conversationTagsStr = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                boolean z = true;
                for (String str : set) {
                    if (!z) {
                        sb2.append(',');
                    }
                    sb2.append(str);
                    z = false;
                }
                this.conversationTagsStr = sb2.toString();
            }
        }
        this.conversationTags = set;
    }

    public void setConversationTagsStr(String str) {
        if (!Objects.equals(this.conversationTagsStr, str) && this.conversationTags != null) {
            if (str != null) {
                this.conversationTags = new HashSet(Arrays.asList(str.split(",")));
            } else {
                this.conversationTags = Collections.emptySet();
            }
        }
        this.conversationTagsStr = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setExtStr(String str) {
        this.ext = C09EF.LIZIZ(str);
    }

    public void setFavor(int i) {
        this.favor = i;
    }

    public void setMute(int i) {
        this.mute = i;
    }

    public void setSetFavoriteTime(long j) {
        this.setFavoriteTime = j;
    }

    public void setSetTopTime(long j) {
        this.setTopTime = j;
    }

    public void setStickTop(int i) {
        this.stickTop = i;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
