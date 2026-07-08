package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1403260mcW {
    public static final EnumC1403260mcW ALL;
    public static final EnumC1403260mcW DUET;
    public static final EnumC1403260mcW FORWARD_2_STORY;
    public static final EnumC1403260mcW IMAGES;
    public static final /* synthetic */ EnumC1403260mcW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1403260mcW PHOTO_MV;
    public static final EnumC1403260mcW RECORD;
    public static final EnumC1403260mcW SINGLE_IMAGE;
    public static final EnumC1403260mcW STITCH;
    public static final EnumC1403260mcW TEMPLATE_MV;
    public static final EnumC1403260mcW UPLOAD_VIDEO;
    public final Function1<VideoPublishEditModel, Boolean> LL;

    public static InterfaceC2044707zh<EnumC1403260mcW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1403260mcW enumC1403260mcW = new EnumC1403260mcW(0, "DUET", new C1403200mcQ());
        DUET = enumC1403260mcW;
        EnumC1403260mcW enumC1403260mcW2 = new EnumC1403260mcW(1, "STITCH", new C1403210mcR());
        STITCH = enumC1403260mcW2;
        EnumC1403260mcW enumC1403260mcW3 = new EnumC1403260mcW(2, "FORWARD_2_STORY", new C1403180mcO());
        FORWARD_2_STORY = enumC1403260mcW3;
        EnumC1403260mcW enumC1403260mcW4 = new EnumC1403260mcW(3, "SINGLE_IMAGE", new C1403270mcX());
        SINGLE_IMAGE = enumC1403260mcW4;
        EnumC1403260mcW enumC1403260mcW5 = new EnumC1403260mcW(4, "IMAGES", new C1403190mcP());
        IMAGES = enumC1403260mcW5;
        EnumC1403260mcW enumC1403260mcW6 = new EnumC1403260mcW(5, "PHOTO_MV", new C1403220mcS());
        PHOTO_MV = enumC1403260mcW6;
        EnumC1403260mcW enumC1403260mcW7 = new EnumC1403260mcW(6, "TEMPLATE_MV", new C1403230mcT());
        TEMPLATE_MV = enumC1403260mcW7;
        EnumC1403260mcW enumC1403260mcW8 = new EnumC1403260mcW(7, "UPLOAD_VIDEO", new C1403240mcU());
        UPLOAD_VIDEO = enumC1403260mcW8;
        EnumC1403260mcW enumC1403260mcW9 = new EnumC1403260mcW(8, "RECORD", new C1403280mcY());
        RECORD = enumC1403260mcW9;
        EnumC1403260mcW enumC1403260mcW10 = new EnumC1403260mcW(9, "ALL", new C1403250mcV());
        ALL = enumC1403260mcW10;
        EnumC1403260mcW[] enumC1403260mcWArr = {enumC1403260mcW, enumC1403260mcW2, enumC1403260mcW3, enumC1403260mcW4, enumC1403260mcW5, enumC1403260mcW6, enumC1403260mcW7, enumC1403260mcW8, enumC1403260mcW9, enumC1403260mcW10};
        LLILLJJLI = enumC1403260mcWArr;
        LLILLL = new C2254308sP(enumC1403260mcWArr);
    }

    public static EnumC1403260mcW[] values() {
        return (EnumC1403260mcW[]) LLILLJJLI.clone();
    }

    public final Function1<VideoPublishEditModel, Boolean> getPredicate() {
        return this.LL;
    }

    public static EnumC1403260mcW valueOf(String str) {
        return (EnumC1403260mcW) C08FF.LIZ(EnumC1403260mcW.class, str);
    }

    public EnumC1403260mcW(int i, String str, Function1 function1) {
        this.LL = function1;
    }
}
