package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BillingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MethodPhotoWithId;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7768031q extends AbstractC756202xM {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final Boolean LLILZLL;
    public final PaymentInfo LLIZ;
    public final CopyOnWriteArrayList<PaymentMethod> LLIZLLLIL;
    public final List<PaymentMethod> LLJ;
    public final List<PaymentMethod> LLJI;
    public final List<String> LLJIJIL;
    public final List<MethodPhotoWithId> LLJILJIL;
    public final String LLJILJILJ;
    public final BillingAddressData LLJILLL;
    public final Integer LLJJ;
    public final Boolean LLJJI;
    public final Boolean LLJJIII;
    public final PaymentMethod LLJJIJI;
    public final Boolean LLJJIJIIJIL;
    public final Boolean LLJJIJIL;
    public Object LLJJJ;
    public final List<PaymentMethod> LLJJJIL;
    public final boolean LLJJJJ;
    public final BackupPaymentInfo LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final String LLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7768031q)) {
            return false;
        }
        C7768031q c7768031q = (C7768031q) obj;
        return Intrinsics.LJFF(this.LLILZLL, c7768031q.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c7768031q.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c7768031q.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c7768031q.LLJ) && Intrinsics.LJFF(this.LLJI, c7768031q.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c7768031q.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c7768031q.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c7768031q.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c7768031q.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c7768031q.LLJJ) && Intrinsics.LJFF(this.LLJJI, c7768031q.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c7768031q.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c7768031q.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c7768031q.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c7768031q.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c7768031q.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c7768031q.LLJJJIL) && this.LLJJJJ == c7768031q.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, c7768031q.LLJJJJJIL);
    }

    public final int hashCode() {
        Boolean bool = this.LLILZLL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        PaymentInfo paymentInfo = this.LLIZ;
        int iHashCode2 = (iHashCode + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.hashCode())) * 31;
        List<PaymentMethod> list = this.LLJ;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<PaymentMethod> list2 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MethodPhotoWithId> list4 = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        BillingAddressData billingAddressData = this.LLJILLL;
        int iHashCode9 = (iHashCode8 + (billingAddressData == null ? 0 : billingAddressData.hashCode())) * 31;
        Integer num = this.LLJJ;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.LLJJI;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LLJJIII;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        PaymentMethod paymentMethod = this.LLJJIJI;
        int iHashCode13 = (iHashCode12 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        Boolean bool4 = this.LLJJIJIIJIL;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.LLJJIJIL;
        int iHashCode15 = (iHashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Object obj = this.LLJJJ;
        int iHashCode16 = (iHashCode15 + (obj == null ? 0 : obj.hashCode())) * 31;
        List<PaymentMethod> list5 = this.LLJJJIL;
        int iHashCode17 = (((iHashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31;
        BackupPaymentInfo backupPaymentInfo = this.LLJJJJJIL;
        return iHashCode17 + (backupPaymentInfo != null ? backupPaymentInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentInfoListVO(isSelectedPaymentInfoFromOSP=" + this.LLILZLL + ", selectedPaymentInfo=" + this.LLIZ + ", recommendPaymentMethodList=" + this.LLIZLLLIL + ", paymentMethodList=" + this.LLJ + ", storedPaymentMethodList=" + this.LLJI + ", methodsPhotos=" + this.LLJIJIL + ", methodsPhotosWithPmId=" + this.LLJILJIL + ", paymentMethodText=" + this.LLJILJILJ + ", billingAddress=" + this.LLJILLL + ", recommendMethodShowCount=" + this.LLJJ + ", isUseSkeleton=" + this.LLJJI + ", isPreHandle=" + this.LLJJIII + ", creditMethod=" + this.LLJJIJI + ", isFinishedData=" + this.LLJJIJIIJIL + ", isNewUser=" + this.LLJJIJIL + ", refreshState=" + this.LLJJJ + ", allPaymentList=" + this.LLJJJIL + ", forMiniOsp=" + this.LLJJJJ + ", backupPaymentInfo=" + this.LLJJJJJIL + ')';
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJJL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C7768031q.class, interfaceC1891350zJl.getClass());
    }

    public static C7768031q LIZIZ(C7768031q c7768031q, PaymentInfo paymentInfo, CopyOnWriteArrayList copyOnWriteArrayList, Boolean bool, int i) {
        Boolean bool2;
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        List<String> list3;
        List<MethodPhotoWithId> list4;
        String str;
        BillingAddressData billingAddressData;
        Integer num;
        Boolean bool3;
        PaymentMethod paymentMethod;
        Boolean bool4;
        Boolean bool5;
        Object obj;
        List<PaymentMethod> list5;
        boolean z;
        Boolean bool6 = bool;
        CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
        PaymentInfo paymentInfo2 = paymentInfo;
        BackupPaymentInfo backupPaymentInfo = null;
        if ((i & 1) != 0) {
            bool2 = c7768031q.LLILZLL;
        } else {
            bool2 = null;
        }
        if ((i & 2) != 0) {
            paymentInfo2 = c7768031q.LLIZ;
        }
        if ((i & 4) != 0) {
            copyOnWriteArrayList2 = c7768031q.LLIZLLLIL;
        }
        if ((i & 8) != 0) {
            list = c7768031q.LLJ;
        } else {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = c7768031q.LLJI;
        } else {
            list2 = null;
        }
        if ((i & 32) != 0) {
            list3 = c7768031q.LLJIJIL;
        } else {
            list3 = null;
        }
        if ((i & 64) != 0) {
            list4 = c7768031q.LLJILJIL;
        } else {
            list4 = null;
        }
        if ((i & 128) != 0) {
            str = c7768031q.LLJILJILJ;
        } else {
            str = null;
        }
        if ((i & 256) != 0) {
            billingAddressData = c7768031q.LLJILLL;
        } else {
            billingAddressData = null;
        }
        if ((i & 512) != 0) {
            num = c7768031q.LLJJ;
        } else {
            num = null;
        }
        if ((i & 1024) != 0) {
            bool6 = c7768031q.LLJJI;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool3 = c7768031q.LLJJIII;
        } else {
            bool3 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            paymentMethod = c7768031q.LLJJIJI;
        } else {
            paymentMethod = null;
        }
        if ((i & 8192) != 0) {
            bool4 = c7768031q.LLJJIJIIJIL;
        } else {
            bool4 = null;
        }
        if ((i & 16384) != 0) {
            bool5 = c7768031q.LLJJIJIL;
        } else {
            bool5 = null;
        }
        if ((32768 & i) != 0) {
            obj = c7768031q.LLJJJ;
        } else {
            obj = null;
        }
        if ((65536 & i) != 0) {
            list5 = c7768031q.LLJJJIL;
        } else {
            list5 = null;
        }
        if ((131072 & i) != 0) {
            z = c7768031q.LLJJJJ;
        } else {
            z = false;
        }
        if ((i & 262144) != 0) {
            backupPaymentInfo = c7768031q.LLJJJJJIL;
        }
        c7768031q.getClass();
        return new C7768031q(bool2, paymentInfo2, (CopyOnWriteArrayList<PaymentMethod>) copyOnWriteArrayList2, list, list2, list3, list4, str, billingAddressData, num, bool6, bool3, paymentMethod, bool4, bool5, obj, list5, z, backupPaymentInfo);
    }

    public /* synthetic */ C7768031q(Boolean bool, PaymentInfo paymentInfo, CopyOnWriteArrayList copyOnWriteArrayList, List list, List list2, List list3, List list4, String str, BillingAddressData billingAddressData, Integer num, Boolean bool2, Boolean bool3, PaymentMethod paymentMethod, Boolean bool4, Boolean bool5, List list5, boolean z, BackupPaymentInfo backupPaymentInfo, int i) {
        this(bool, paymentInfo, (CopyOnWriteArrayList<PaymentMethod>) copyOnWriteArrayList, (List<PaymentMethod>) list, (List<PaymentMethod>) list2, (List<String>) list3, (List<MethodPhotoWithId>) list4, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : billingAddressData, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : bool2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool3, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : paymentMethod, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (Object) null, (List<PaymentMethod>) ((65536 & i) != 0 ? null : list5), (131072 & i) != 0 ? false : z, (i & 262144) != 0 ? null : backupPaymentInfo);
    }

    public C7768031q(Boolean bool, PaymentInfo paymentInfo, CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList, List<PaymentMethod> list, List<PaymentMethod> list2, List<String> list3, List<MethodPhotoWithId> list4, String str, BillingAddressData billingAddressData, Integer num, Boolean bool2, Boolean bool3, PaymentMethod paymentMethod, Boolean bool4, Boolean bool5, Object obj, List<PaymentMethod> list5, boolean z, BackupPaymentInfo backupPaymentInfo) {
        this.LLILZLL = bool;
        this.LLIZ = paymentInfo;
        this.LLIZLLLIL = copyOnWriteArrayList;
        this.LLJ = list;
        this.LLJI = list2;
        this.LLJIJIL = list3;
        this.LLJILJIL = list4;
        this.LLJILJILJ = str;
        this.LLJILLL = billingAddressData;
        this.LLJJ = num;
        this.LLJJI = bool2;
        this.LLJJIII = bool3;
        this.LLJJIJI = paymentMethod;
        this.LLJJIJIIJIL = bool4;
        this.LLJJIJIL = bool5;
        this.LLJJJ = obj;
        this.LLJJJIL = list5;
        this.LLJJJJ = z;
        this.LLJJJJJIL = backupPaymentInfo;
        this.LLJJJJLIIL = "payment_methods";
        this.LLJJL = "item_payment_methods";
    }
}
