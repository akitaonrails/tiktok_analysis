package X;

import android.content.Context;
import android.util.Size;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarImageItem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yMH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854470yMH implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final Size LLIZLLLIL;
    public final boolean LLJ;
    public final ActionBarImageItem LLJI;
    public final Function2<C1854470yMH, Context, Unit> LLJIJIL;
    public final EnumC1854500yMK LLJILJIL;
    public final Integer LLJILJILJ;
    public final String LLJILLL;
    public final Pair<Integer, Integer> LLJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1854470yMH)) {
            return false;
        }
        C1854470yMH c1854470yMH = (C1854470yMH) obj;
        return Intrinsics.LJFF(this.LL, c1854470yMH.LL) && this.LLILLJJLI == c1854470yMH.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1854470yMH.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1854470yMH.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1854470yMH.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1854470yMH.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1854470yMH.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1854470yMH.LLIZLLLIL) && this.LLJ == c1854470yMH.LLJ && Intrinsics.LJFF(this.LLJI, c1854470yMH.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1854470yMH.LLJIJIL) && this.LLJILJIL == c1854470yMH.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c1854470yMH.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1854470yMH.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1854470yMH.LLJJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZ;
        int iHashCode6 = (((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        ActionBarImageItem actionBarImageItem = this.LLJI;
        int iHashCode7 = (iHashCode6 + (actionBarImageItem == null ? 0 : actionBarImageItem.hashCode())) * 31;
        Function2<C1854470yMH, Context, Unit> function2 = this.LLJIJIL;
        int iHashCode8 = (iHashCode7 + (function2 == null ? 0 : function2.hashCode())) * 31;
        EnumC1854500yMK enumC1854500yMK = this.LLJILJIL;
        int iHashCode9 = (iHashCode8 + (enumC1854500yMK == null ? 0 : enumC1854500yMK.hashCode())) * 31;
        Integer num2 = this.LLJILJILJ;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.LLJILLL;
        return ((iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.LLJJ.hashCode();
    }

    public final String toString() {
        return "TakoActionBarSugItem(text=" + this.LL + ", index=" + this.LLILLJJLI + ", logId=" + this.LLILLL + ", icon=" + this.LLILZ + ", darkIcon=" + this.LLILZIL + ", lightIcon=" + this.LLILZLL + ", startIconUrl=" + this.LLIZ + ", startIconSize=" + this.LLIZLLLIL + ", startIconWithRadius=" + this.LLJ + ", actionBarImageItem=" + this.LLJI + ", onClick=" + this.LLJIJIL + ", subSkillActionType=" + this.LLJILJIL + ", endIconRes=" + this.LLJILJILJ + ", prompt=" + this.LLJILLL + ", margin=" + this.LLJJ + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public static C1854470yMH LIZ(C1854470yMH c1854470yMH, String str, Integer num, String str2, Size size, boolean z, Pair pair, int i) {
        int i2;
        String str3;
        String str4;
        String str5;
        ActionBarImageItem actionBarImageItem;
        Function2<C1854470yMH, Context, Unit> function2;
        EnumC1854500yMK enumC1854500yMK;
        Integer num2;
        String str6 = str;
        Size size2 = size;
        String str7 = str2;
        boolean z2 = z;
        Pair pair2 = pair;
        Integer num3 = num;
        if ((i & 1) != 0) {
            str6 = c1854470yMH.LL;
        }
        if ((i & 2) != 0) {
            i2 = c1854470yMH.LLILLJJLI;
        } else {
            i2 = 0;
        }
        String str8 = null;
        if ((i & 4) != 0) {
            str3 = c1854470yMH.LLILLL;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num3 = c1854470yMH.LLILZ;
        }
        if ((i & 16) != 0) {
            str4 = c1854470yMH.LLILZIL;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = c1854470yMH.LLILZLL;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str7 = c1854470yMH.LLIZ;
        }
        if ((i & 128) != 0) {
            size2 = c1854470yMH.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z2 = c1854470yMH.LLJ;
        }
        if ((i & 512) != 0) {
            actionBarImageItem = c1854470yMH.LLJI;
        } else {
            actionBarImageItem = null;
        }
        if ((i & 1024) != 0) {
            function2 = c1854470yMH.LLJIJIL;
        } else {
            function2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            enumC1854500yMK = c1854470yMH.LLJILJIL;
        } else {
            enumC1854500yMK = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num2 = c1854470yMH.LLJILJILJ;
        } else {
            num2 = null;
        }
        if ((i & 8192) != 0) {
            str8 = c1854470yMH.LLJILLL;
        }
        if ((i & 16384) != 0) {
            pair2 = c1854470yMH.LLJJ;
        }
        return new C1854470yMH(str6, i2, str3, num3, str4, str5, str7, size2, z2, actionBarImageItem, function2, enumC1854500yMK, num2, str8, pair2);
    }

    public /* synthetic */ C1854470yMH(String str, int i, String str2, Integer num, String str3, ActionBarImageItem actionBarImageItem, Function2 function2, EnumC1854500yMK enumC1854500yMK, Integer num2, String str4, int i2) {
        Size size;
        int i3;
        String str5 = str4;
        Integer num3 = num2;
        ActionBarImageItem actionBarImageItem2 = actionBarImageItem;
        String str6 = str3;
        Integer num4 = num;
        EnumC1854500yMK enumC1854500yMK2 = enumC1854500yMK;
        String str7 = (i2 & 4) != 0 ? null : str2;
        num4 = (i2 & 8) != 0 ? null : num4;
        str6 = (i2 & 64) != 0 ? null : str6;
        if ((i2 & 128) != 0) {
            C1163410gNf.LIZ.getClass();
            if (C1163410gNf.LIZ()) {
                i3 = 18;
            } else {
                i3 = 14;
            }
            size = new Size(i3, C1163410gNf.LIZ() ? 18 : 14);
        } else {
            size = null;
        }
        this(str, i, str7, num4, null, null, str6, size, false, (i2 & 512) != 0 ? null : actionBarImageItem2, function2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : enumC1854500yMK2, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? Integer.valueOf(R.raw.icon_arrow_right_ltr) : num3, (i2 & 8192) != 0 ? null : str5, (i2 & 16384) != 0 ? new Pair(0, 6) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1854470yMH(String str, int i, String str2, Integer num, String str3, String str4, String str5, Size size, boolean z, ActionBarImageItem actionBarImageItem, Function2<? super C1854470yMH, ? super Context, Unit> function2, EnumC1854500yMK enumC1854500yMK, Integer num2, String str6, Pair<Integer, Integer> pair) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = size;
        this.LLJ = z;
        this.LLJI = actionBarImageItem;
        this.LLJIJIL = function2;
        this.LLJILJIL = enumC1854500yMK;
        this.LLJILJILJ = num2;
        this.LLJILLL = str6;
        this.LLJJ = pair;
    }
}
