package X;

import android.util.Size;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853460yKe implements InterfaceC1891350zJl, Serializable {
    public static final Size IMAGE_TEMPLATE_SIZE;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final C1845270y7R LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final boolean LLJIJIL;
    public final transient Size LLJILJIL;
    public final boolean LLJILJILJ;
    public final Integer LLJILLL;
    public final String LLJJ;
    public final Integer LLJJI;
    public final Integer LLJJIII;
    public final Integer LLJJIJI;
    public static final C1853470yKf Companion = new Object() { // from class: X.0yKf
    };
    public static final int $stable = 8;
    public static final Size PROMPT_TEMPLATE_SIZE = new Size(240, 320);

    public C1853460yKe() {
        this(null, null, null, null, null, false, null, false, "", "", false, IMAGE_TEMPLATE_SIZE, false, null, null, null, null, null);
    }

    public final C1853460yKe copy(String str, String str2, String str3, String str4, String str5, boolean z, C1845270y7R c1845270y7R, boolean z2, String str6, String str7, boolean z3, Size size, boolean z4, Integer num, String str8, Integer num2, Integer num3, Integer num4) {
        return new C1853460yKe(str, str2, str3, str4, str5, z, c1845270y7R, z2, str6, str7, z3, size, z4, num, str8, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853460yKe)) {
            return false;
        }
        C1853460yKe c1853460yKe = (C1853460yKe) obj;
        return Intrinsics.LJFF(this.LL, c1853460yKe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1853460yKe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1853460yKe.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1853460yKe.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1853460yKe.LLILZIL) && this.LLILZLL == c1853460yKe.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1853460yKe.LLIZ) && this.LLIZLLLIL == c1853460yKe.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1853460yKe.LLJ) && Intrinsics.LJFF(this.LLJI, c1853460yKe.LLJI) && this.LLJIJIL == c1853460yKe.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1853460yKe.LLJILJIL) && this.LLJILJILJ == c1853460yKe.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1853460yKe.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1853460yKe.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1853460yKe.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1853460yKe.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1853460yKe.LLJJIJI);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C1845270y7R c1845270y7R = this.LLIZ;
        int iHashCode6 = (((((((((((((iHashCode5 + (c1845270y7R == null ? 0 : c1845270y7R.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31;
        Integer num = this.LLJILLL;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.LLJJ;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.LLJJI;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLJJIII;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLJJIJI;
        return iHashCode10 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "TemplateItem(templateId=" + this.LL + ", taskType=" + this.LLILLJJLI + ", systemPrompt=" + this.LLILLL + ", imageUri=" + this.LLILZ + ", coverContainerDecoration=" + this.LLILZIL + ", isGenerateVideo=" + this.LLILZLL + ", videoData=" + this.LLIZ + ", enableAutoPlayVideo=" + this.LLIZLLLIL + ", title=" + this.LLJ + ", subtitle=" + this.LLJI + ", selected=" + this.LLJIJIL + ", size=" + this.LLJILJIL + ", useNewUIOfUnify=" + this.LLJILJILJ + ", defaultStdSize=" + this.LLJILLL + ", skillInfo=" + this.LLJJ + ", generateType=" + this.LLJJI + ", processType=" + this.LLJJIII + ", rank=" + this.LLJJIJI + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0yKf] */
    static {
        C1561220qjI.LIZ.getClass();
        IMAGE_TEMPLATE_SIZE = C1561220qjI.LIZ() ? new Size(180, 240) : new Size(150, 200);
    }

    public final String getCoverContainerDecoration() {
        return this.LLILZIL;
    }

    public final Integer getDefaultStdSize() {
        return this.LLJILLL;
    }

    public final boolean getEnableAutoPlayVideo() {
        return this.LLIZLLLIL;
    }

    public final Integer getGenerateType() {
        return this.LLJJI;
    }

    public final String getImageUri() {
        return this.LLILZ;
    }

    public final Integer getProcessType() {
        return this.LLJJIII;
    }

    public final Integer getRank() {
        return this.LLJJIJI;
    }

    public final boolean getSelected() {
        return this.LLJIJIL;
    }

    public final Size getSize() {
        return this.LLJILJIL;
    }

    public final String getSkillInfo() {
        return this.LLJJ;
    }

    public final String getSubtitle() {
        return this.LLJI;
    }

    public final String getSystemPrompt() {
        return this.LLILLL;
    }

    public final String getTaskType() {
        return this.LLILLJJLI;
    }

    public final String getTemplateId() {
        return this.LL;
    }

    public final String getTitle() {
        return this.LLJ;
    }

    public final boolean getUseNewUIOfUnify() {
        return this.LLJILJILJ;
    }

    public final C1845270y7R getVideoData() {
        return this.LLIZ;
    }

    public final boolean isGenerateVideo() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1853460yKe) || this.LLJIJIL != ((C1853460yKe) interfaceC1891350zJl).LLJIJIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1853460yKe)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1853460yKe) interfaceC1891350zJl).LL);
    }

    public C1853460yKe(String str, String str2, String str3, String str4, String str5, boolean z, C1845270y7R c1845270y7R, boolean z2, String str6, String str7, boolean z3, Size size, boolean z4, Integer num, String str8, Integer num2, Integer num3, Integer num4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = z;
        this.LLIZ = c1845270y7R;
        this.LLIZLLLIL = z2;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = z3;
        this.LLJILJIL = size;
        this.LLJILJILJ = z4;
        this.LLJILLL = num;
        this.LLJJ = str8;
        this.LLJJI = num2;
        this.LLJJIII = num3;
        this.LLJJIJI = num4;
    }
}
