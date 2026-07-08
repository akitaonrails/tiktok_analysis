package X;

import android.net.Uri;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YC6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YC6 implements Serializable {
    public String codec;
    public String displayType;
    public Long duration;
    public final Map<String, String> ext;
    public String hash;
    public int index;
    public long length;
    public String localPath;
    public EnumC870720YDu mediaType;
    public MediaURLStruct mediaUrlStruct;
    public String mimeType;
    public String msgUuid;
    public String remoteUrl;
    public int status;
    public String type;
    public Uri uploadUri;

    public C0YC6() {
        this(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
    }

    public final C0YC6 copy(String str, String str2, String str3, long j, String str4, int i, Map<String, String> map, int i2, String str5, String str6, String str7, Uri uri, EnumC870720YDu enumC870720YDu, MediaURLStruct mediaURLStruct, Long l, String str8) {
        return new C0YC6(str, str2, str3, j, str4, i, map, i2, str5, str6, str7, uri, enumC870720YDu, mediaURLStruct, l, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YC6)) {
            return false;
        }
        C0YC6 c0yc6 = (C0YC6) obj;
        return Intrinsics.LJFF(this.msgUuid, c0yc6.msgUuid) && Intrinsics.LJFF(this.localPath, c0yc6.localPath) && Intrinsics.LJFF(this.remoteUrl, c0yc6.remoteUrl) && this.length == c0yc6.length && Intrinsics.LJFF(this.type, c0yc6.type) && this.index == c0yc6.index && Intrinsics.LJFF(this.ext, c0yc6.ext) && this.status == c0yc6.status && Intrinsics.LJFF(this.hash, c0yc6.hash) && Intrinsics.LJFF(this.displayType, c0yc6.displayType) && Intrinsics.LJFF(this.mimeType, c0yc6.mimeType) && Intrinsics.LJFF(this.uploadUri, c0yc6.uploadUri) && this.mediaType == c0yc6.mediaType && Intrinsics.LJFF(this.mediaUrlStruct, c0yc6.mediaUrlStruct) && Intrinsics.LJFF(this.duration, c0yc6.duration) && Intrinsics.LJFF(this.codec, c0yc6.codec);
    }

    public int hashCode() {
        String str = this.msgUuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.localPath;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remoteUrl;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Y2(this.length)) * 31;
        String str4 = this.type;
        int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.index) * 31) + this.ext.hashCode()) * 31) + this.status) * 31;
        String str5 = this.hash;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mimeType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Uri uri = this.uploadUri;
        int iHashCode8 = (iHashCode7 + (uri == null ? 0 : uri.hashCode())) * 31;
        EnumC870720YDu enumC870720YDu = this.mediaType;
        int iHashCode9 = (iHashCode8 + (enumC870720YDu == null ? 0 : enumC870720YDu.hashCode())) * 31;
        MediaURLStruct mediaURLStruct = this.mediaUrlStruct;
        int iHashCode10 = (iHashCode9 + (mediaURLStruct == null ? 0 : mediaURLStruct.hashCode())) * 31;
        Long l = this.duration;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        String str8 = this.codec;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "Attachment(msgUuid=" + this.msgUuid + ", localPath=" + this.localPath + ", remoteUrl=" + this.remoteUrl + ", length=" + this.length + ", type=" + this.type + ", index=" + this.index + ", ext=" + this.ext + ", status=" + this.status + ", hash=" + this.hash + ", displayType=" + this.displayType + ", mimeType=" + this.mimeType + ", uploadUri=" + this.uploadUri + ", mediaType=" + this.mediaType + ", mediaUrlStruct=" + this.mediaUrlStruct + ", duration=" + this.duration + ", codec=" + this.codec + ')';
    }

    public final String getAlgorithm() {
        return this.ext.get("s:algorithm");
    }

    public final String getAudioId() {
        String str = this.ext.get("s:file_ext_key_audio_id");
        return str == null ? "" : str;
    }

    public final String getEncryptUrl() {
        return this.ext.get("s:encryptUrl");
    }

    public final String getExtStr() {
        return C09EF.LIZ(this.ext);
    }

    public final long getOriginalDuration() {
        return getLongFromExt("s:file_ext_key_duration");
    }

    public final int getOriginalHeight() {
        return getIntFromExt("s:file_ext_key_original_height");
    }

    public final int getOriginalWidth() {
        return getIntFromExt("s:file_ext_key_original_width");
    }

    public final String getResourceId() {
        EnumC870720YDu enumC870720YDu = this.mediaType;
        if (enumC870720YDu == null) {
            return null;
        }
        int i = C870700YDs.LIZ[enumC870720YDu.ordinal()];
        if (i == 1) {
            return getUri();
        }
        if (i == 2) {
            return getVid();
        }
        if (i == 3) {
            return getAudioId();
        }
        return null;
    }

    public final String getSecretKey() {
        return this.ext.get("s:secretKey");
    }

    public final int getUploadState() {
        return getIntFromExt("s:file_ext_key_upload_state");
    }

    public final String getUri() {
        String str = this.ext.get("s:file_ext_key_uri");
        return str == null ? "" : str;
    }

    public final String getVid() {
        String str = this.ext.get("s:file_ext_key_vid");
        return str == null ? "" : str;
    }

    public final boolean isFromTikTokRecord() {
        return Intrinsics.LJFF(this.ext.get("s:file_ext_key_from_tt_record"), "1");
    }

    private final int getIntFromExt(String str) {
        Integer numLJIIJJI;
        String str2 = this.ext.get(str);
        if (str2 == null || str2.length() == 0 || (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) == null) {
            return 0;
        }
        return numLJIIJJI.intValue();
    }

    private final long getLongFromExt(String str) {
        boolean z;
        Long lLJIILIIL;
        String str2 = this.ext.get(str);
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) == null) {
            return 0L;
        }
        return lLJIILIIL.longValue();
    }

    public final void setAlgorithm(String str) {
        this.ext.put("s:algorithm", str);
    }

    public final void setAudioId(String str) {
        if (str != null && str.length() != 0) {
            this.ext.put("s:file_ext_key_audio_id", str);
        }
    }

    public final void setCodec(String str) {
        this.codec = str;
    }

    public final void setDisplayType(String str) {
        this.displayType = str;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public final void setEncryptUrl(String str) {
        this.ext.put("s:encryptUrl", str);
    }

    public final void setExtStr(String str) {
        this.ext.clear();
        Map<String, String> mapLIZIZ = C09EF.LIZIZ(str);
        if (mapLIZIZ != null) {
            this.ext.putAll(mapLIZIZ);
        }
    }

    public final void setFromTikTokRecord(boolean z) {
        Map<String, String> map;
        String str;
        if (z) {
            map = this.ext;
            str = "1";
        } else {
            map = this.ext;
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("s:file_ext_key_from_tt_record", str);
    }

    public final void setHash(String str) {
        this.hash = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLength(long j) {
        this.length = j;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setMediaType(EnumC870720YDu enumC870720YDu) {
        this.mediaType = enumC870720YDu;
    }

    public final void setMediaUrlStruct(MediaURLStruct mediaURLStruct) {
        this.mediaUrlStruct = mediaURLStruct;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setMsgUuid(String str) {
        this.msgUuid = str;
    }

    public final void setOriginalDuration(long j) {
        this.ext.put("s:file_ext_key_duration", String.valueOf(j));
    }

    public final void setOriginalHeight(int i) {
        this.ext.put("s:file_ext_key_original_height", String.valueOf(i));
    }

    public final void setOriginalWidth(int i) {
        this.ext.put("s:file_ext_key_original_width", String.valueOf(i));
    }

    public final void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    public final void setSecretKey(String str) {
        this.ext.put("s:secretKey", str);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUploadState(int i) {
        this.ext.put("s:file_ext_key_upload_state", String.valueOf(i));
    }

    public final void setUploadUri(Uri uri) {
        this.uploadUri = uri;
    }

    public final void setUri(String str) {
        if (str != null && str.length() != 0) {
            this.ext.put("s:file_ext_key_uri", str);
        }
    }

    public final void setVid(String str) {
        if (str != null && str.length() != 0) {
            this.ext.put("s:file_ext_key_vid", str);
        }
    }

    public final void updateExt(Map<String, String> map) {
        this.ext.putAll(map);
    }

    public C0YC6(String str, String str2, String str3, long j, String str4, int i, Map<String, String> map, int i2, String str5, String str6, String str7, Uri uri, EnumC870720YDu enumC870720YDu, MediaURLStruct mediaURLStruct, Long l, String str8) {
        this.msgUuid = str;
        this.localPath = str2;
        this.remoteUrl = str3;
        this.length = j;
        this.type = str4;
        this.index = i;
        this.ext = map;
        this.status = i2;
        this.hash = str5;
        this.displayType = str6;
        this.mimeType = str7;
        this.uploadUri = uri;
        this.mediaType = enumC870720YDu;
        this.mediaUrlStruct = mediaURLStruct;
        this.duration = l;
        this.codec = str8;
    }
}
