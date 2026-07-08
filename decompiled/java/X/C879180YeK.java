package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0YeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879180YeK {
    public final EnumC879190YeL LIZ;
    public final List<C876550Ya5> LIZIZ;
    public final List<IMContact> LIZJ;
    public final C869590Y9l LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final String LJI;
    public final CharSequence LJII;
    public final List<UrlModel> LJIIIIZZ;
    public final C879380Yee LJIIIZ;
    public final Integer LJIIJ;

    public final String toString() {
        return "IMInnerPushContent(type=" + this.LIZ + ", unitList=" + this.LIZIZ + ", contactList=" + this.LIZJ + ", message=" + this.LIZLLL + ", conversationType=" + this.LJ + ", conversationId=" + this.LJFF + ", title=" + this.LJI + ", description=" + ((Object) this.LJII) + ", avatarList=" + this.LJIIIIZZ + ", mobParams=" + this.LJIIIZ + ", defaultAvatarRes=" + this.LJIIJ + ')';
    }

    public final boolean LIZ() {
        EnumC879190YeL enumC879190YeL = this.LIZ;
        return enumC879190YeL == EnumC879190YeL.AGGREGATED_SINGLE_CONVERSATION || enumC879190YeL == EnumC879190YeL.AGGREGATED_MULTI_CONVERSATION || enumC879190YeL == EnumC879190YeL.AGGREGATED_MESSAGE_REQUEST;
    }

    public final boolean LIZIZ() {
        EnumC879190YeL enumC879190YeL = this.LIZ;
        if (enumC879190YeL != EnumC879190YeL.AGGREGATED_MESSAGE_REQUEST) {
            return enumC879190YeL == EnumC879190YeL.SINGLE_MESSAGE && C1509505vZ.LIZ(this.LIZLLL);
        }
        return true;
    }

    public final boolean LIZJ() {
        EnumC879190YeL enumC879190YeL = this.LIZ;
        return enumC879190YeL == EnumC879190YeL.SINGLE_MESSAGE || enumC879190YeL == EnumC879190YeL.SINGLE_TIP || enumC879190YeL == EnumC879190YeL.SINGLE_PROPERTY || enumC879190YeL == EnumC879190YeL.SINGLE_TCM;
    }

    public /* synthetic */ C879180YeK(EnumC879190YeL enumC879190YeL, List list, List list2, C869590Y9l c869590Y9l, Integer num, String str, String str2, CharSequence charSequence, List list3, C879380Yee c879380Yee, int i) {
        this((i & 1) != 0 ? EnumC879190YeL.UNKNOWN : enumC879190YeL, (List<C876550Ya5>) list, (List<? extends IMContact>) list2, (i & 8) != 0 ? null : c869590Y9l, num, (i & 32) == 0 ? str : null, str2, charSequence, (List<? extends UrlModel>) list3, c879380Yee, (Integer) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C879180YeK(EnumC879190YeL enumC879190YeL, List<C876550Ya5> list, List<? extends IMContact> list2, C869590Y9l c869590Y9l, Integer num, String str, String str2, CharSequence charSequence, List<? extends UrlModel> list3, C879380Yee c879380Yee, Integer num2) {
        this.LIZ = enumC879190YeL;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = c869590Y9l;
        this.LJ = num;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = charSequence;
        this.LJIIIIZZ = list3;
        this.LJIIIZ = c879380Yee;
        this.LJIIJ = num2;
    }
}
