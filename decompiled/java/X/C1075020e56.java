package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0e56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075020e56 implements Serializable {
    public final String birthday;
    public final List<String> contactEmailList;
    public final String contactName;
    public final List<C1074830e4n> contactReadList;
    public final Boolean customRingtone;
    public final Boolean hasAddr;
    public final Boolean hasAvatar;
    public final Boolean hasContacted;
    public final Boolean hasEmail;
    public final Boolean hasEvent;
    public final Boolean hasGroup;
    public final Boolean hasIM;
    public final Boolean hasNickname;
    public final Boolean hasOrg;
    public final Boolean hasRelation;
    public final Boolean hasSocialProfile;
    public final String note;
    public final Boolean starred;
    public final Boolean toVoicemail;
    public final List<String> websiteList;

    public C1075020e56() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public C1075020e56(String str, List<C1074830e4n> list, List<String> list2, String str2, String str3, List<String> list3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14) {
        this.contactName = str;
        this.contactReadList = list;
        this.contactEmailList = list2;
        this.note = str2;
        this.birthday = str3;
        this.websiteList = list3;
        this.hasSocialProfile = bool;
        this.hasEvent = bool2;
        this.hasAvatar = bool3;
        this.hasOrg = bool4;
        this.hasEmail = bool5;
        this.hasIM = bool6;
        this.hasRelation = bool7;
        this.hasAddr = bool8;
        this.starred = bool9;
        this.hasNickname = bool10;
        this.hasContacted = bool11;
        this.hasGroup = bool12;
        this.customRingtone = bool13;
        this.toVoicemail = bool14;
    }

    public C1075020e56(String str, List list, List list2, String str2, String str3, List list3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? C13BV.INSTANCE : list3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, (i & 1024) != 0 ? null : bool5, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool6, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : bool7, (i & 8192) != 0 ? null : bool8, (i & 16384) != 0 ? null : bool9, (32768 & i) != 0 ? null : bool10, (65536 & i) != 0 ? null : bool11, (131072 & i) != 0 ? null : bool12, (262144 & i) != 0 ? null : bool13, (i & 524288) != 0 ? null : bool14);
    }
}
