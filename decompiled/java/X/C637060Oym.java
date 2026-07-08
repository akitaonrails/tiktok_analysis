package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637060Oym implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final UrlModel LLILZ;
    public final UrlModel LLILZIL;
    public final C637040Oyk LLILZLL;
    public final Integer LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final C637030Oyj LLJI;
    public final C637030Oyj LLJIJIL;
    public final boolean LLJILJIL;
    public final Function1<EnumC637460OzQ, Unit> LLJILJILJ;
    public final Map<String, String> LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C637060Oym)) {
            return false;
        }
        C637060Oym c637060Oym = (C637060Oym) obj;
        return Intrinsics.LJFF(this.LL, c637060Oym.LL) && Intrinsics.LJFF(this.LLILLJJLI, c637060Oym.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c637060Oym.LLILLL) && Intrinsics.LJFF(this.LLILZ, c637060Oym.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c637060Oym.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c637060Oym.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c637060Oym.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c637060Oym.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c637060Oym.LLJ) && Intrinsics.LJFF(this.LLJI, c637060Oym.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c637060Oym.LLJIJIL) && this.LLJILJIL == c637060Oym.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c637060Oym.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c637060Oym.LLJILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        UrlModel urlModel = this.LLILZ;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        C637040Oyk c637040Oyk = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (c637040Oyk == null ? 0 : c637040Oyk.hashCode())) * 31;
        Integer num = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJ;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C637030Oyj c637030Oyj = this.LLJI;
        int iHashCode8 = (iHashCode7 + (c637030Oyj == null ? 0 : c637030Oyj.hashCode())) * 31;
        C637030Oyj c637030Oyj2 = this.LLJIJIL;
        int iHashCode9 = (((iHashCode8 + (c637030Oyj2 == null ? 0 : c637030Oyj2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31;
        Function1<EnumC637460OzQ, Unit> function1 = this.LLJILJILJ;
        int iHashCode10 = (iHashCode9 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Map<String, String> map = this.LLJILLL;
        return iHashCode10 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TemplateInboxBannerItem(bannerTemplateId=" + this.LL + ", bannerId=" + this.LLILLJJLI + ", title=" + this.LLILLL + ", avatar=" + this.LLILZ + ", avatarDark=" + this.LLILZIL + ", iconModel=" + this.LLILZLL + ", iconDpSize=" + this.LLIZ + ", content=" + this.LLIZLLLIL + ", schema=" + this.LLJ + ", highlightInfo=" + this.LLJI + ", button=" + this.LLJIJIL + ", needDelete=" + this.LLJILJIL + ", onClick=" + this.LLJILJILJ + ", extra=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C637060Oym(String str, String str2, String str3, UrlModel urlModel, C637040Oyk c637040Oyk, String str4, String str5, C637030Oyj c637030Oyj, boolean z, Function1 function1, Map map, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : urlModel, null, (i & 32) != 0 ? null : c637040Oyk, null, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, null, (i & 1024) != 0 ? null : c637030Oyj, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function1, (i & 8192) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C637060Oym(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, C637040Oyk c637040Oyk, Integer num, String str4, String str5, C637030Oyj c637030Oyj, C637030Oyj c637030Oyj2, boolean z, Function1<? super EnumC637460OzQ, Unit> function1, Map<String, String> map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = urlModel;
        this.LLILZIL = urlModel2;
        this.LLILZLL = c637040Oyk;
        this.LLIZ = num;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = c637030Oyj;
        this.LLJIJIL = c637030Oyj2;
        this.LLJILJIL = z;
        this.LLJILJILJ = function1;
        this.LLJILLL = map;
    }
}
