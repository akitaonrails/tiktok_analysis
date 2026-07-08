package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.aigc.migration.model.GenTaskForWorkflowModel;
import com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS93S1000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0LXY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$startGenerationJob$2", f = "AIGCOfflineProcessingViewModel.kt", l = {787}, m = "invokeSuspend")
public final class C0LXY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ List<AIGCInputItem> LLIZLLLIL;
    public final /* synthetic */ CreativeInfo LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ boolean LLJJ;
    public final /* synthetic */ LifecycleOwner LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ Map<String, String> LLJJIJI;
    public final /* synthetic */ boolean LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LXY(String str, AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, String str2, String str3, String str4, String str5, List<AIGCInputItem> list, CreativeInfo creativeInfo, Integer num, String str6, String str7, String str8, String str9, boolean z, LifecycleOwner lifecycleOwner, String str10, Map<String, String> map, boolean z2, String str11, InterfaceC1364105Vn<? super C0LXY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = aIGCOfflineProcessingViewModel;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = list;
        this.LLJ = creativeInfo;
        this.LLJI = num;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str8;
        this.LLJILLL = str9;
        this.LLJJ = z;
        this.LLJJI = lifecycleOwner;
        this.LLJJIII = str10;
        this.LLJJIJI = map;
        this.LLJJIJIIJIL = z2;
        this.LLJJIJIL = str11;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LXY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0LQP c0lqp;
        String str;
        int iIntValue;
        C544540LXg c544540LXg;
        Object objLJIIJ = obj;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationJob$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            if (Intrinsics.LJFF(this.LLILLJJLI, "v2v")) {
                c0lqp = C0LQP.AIGC_WORKFLOW_V2V;
            } else {
                c0lqp = C0LQP.AIGC_WORKFLOW_I2V;
            }
            C545090LZj c545090LZj = this.LLILLL.LLJILJIL;
            String str2 = this.LLJILLL;
            String str3 = this.LLJIJIL;
            boolean z = this.LLJJ;
            CreativeInfo creativeInfo = this.LLJ;
            String str4 = this.LLJILJIL;
            String str5 = this.LLILZLL;
            String str6 = this.LLILZ;
            String str7 = this.LLILZIL;
            String str8 = this.LLIZ;
            String str9 = this.LLJILJILJ;
            OldFrameworkInputModel oldFrameworkInputModel = new OldFrameworkInputModel(new GenTaskForWorkflowModel(c0lqp.getTypeName(), str2, str3, Boolean.valueOf(z)), LIZ(creativeInfo, this.LLJI, str4, str5, str6, str7, str8, str9, str3, this.LLJJIII, this.LLJJIJIL, this.LLIZLLLIL, this.LLJJIJI, this.LLJJIJIIJIL));
            String str10 = this.LLILZ;
            String str11 = "";
            if (str10 == null) {
                str10 = "";
            }
            String str12 = this.LLILZIL;
            if (str12 == null) {
                str = "";
            } else {
                str = str12;
            }
            String str13 = this.LLILZLL;
            if (str13 == null) {
                str13 = "";
            }
            String str14 = this.LLIZ;
            if (str14 == null) {
                str14 = "image2video";
            }
            AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel = this.LLILLL;
            List<AIGCInputItem> list = this.LLIZLLLIL;
            aIGCOfflineProcessingViewModel.getClass();
            if (str12 == null) {
                str12 = "";
            }
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS93S1000000_8(str12, 1));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<AIGCInputItem> it2 = list.iterator();
            while (true) {
                iIntValue = 0;
                if (!it2.hasNext()) {
                    break;
                }
                AIGCInputItem next = it2.next();
                Integer num = next.type;
                int iIntValue2 = 2;
                if (num == null || num.intValue() == 2) {
                    iIntValue = 1;
                }
                String str15 = next.value;
                Integer num2 = next.type;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                }
                String str16 = next.extra;
                if (iIntValue != 0) {
                    c544540LXg = (C544540LXg) c01gwLIZIZ.getValue();
                } else {
                    c544540LXg = null;
                }
                arrayList.add(new C544530LXf(str15, iIntValue2, str16, false, c544540LXg, 8));
            }
            Source source = Source.EFFECT_AIGC;
            CreativeInfo creativeInfo2 = this.LLJ;
            Integer num3 = this.LLJI;
            if (num3 != null) {
                iIntValue = num3.intValue();
            }
            String strValueOf = String.valueOf(iIntValue);
            String str17 = this.LLJIJIL;
            if (str17 == null) {
                str17 = "";
            }
            String strLIZIZ = C0LMJ.LIZIZ(this.LLIZLLLIL);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            String str18 = this.LLJILJIL;
            if (str18 == null) {
                str18 = "";
            }
            String str19 = this.LLJILJILJ;
            if (str19 == null) {
                str19 = "";
            }
            C545510LaP<C550580Lia<C551070LjN>> c545510LaP = new C545510LaP<>(source, arrayList, str14, str10, str, str13, new C550580Lia(creativeInfo2, null, new C551070LjN(strValueOf, str17, strLIZIZ, str18, str19)));
            String str20 = this.LLJILLL;
            String str21 = this.LLJIJIL;
            boolean z2 = this.LLJJ;
            List<AIGCInputItem> list2 = this.LLIZLLLIL;
            ParentTaskInput parentTaskInputLIZ = LIZ(this.LLJ, this.LLJI, this.LLJILJIL, this.LLILZLL, this.LLILZ, this.LLILZIL, this.LLIZ, this.LLJILJILJ, str21, this.LLJJIII, this.LLJJIJIL, list2, this.LLJJIJI, this.LLJJIJIIJIL);
            String taskName = C0LXZ.OFFLINE_PROCESSING.getTaskName();
            String strLIZIZ2 = C0LMJ.LIZIZ(list2);
            if (strLIZIZ2 != null) {
                str11 = strLIZIZ2;
            }
            PublicTaskInput publicTaskInput = new PublicTaskInput(new C382320Eys(), source, taskName, str11, null, null, parentTaskInputLIZ, 48, null);
            this.LL = 1;
            objLJIIJ = c545090LZj.LJIIJ(oldFrameworkInputModel, c545510LaP, str20, str21, z2, publicTaskInput, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationJob$2");
                return objLJFF;
            }
        }
        String str22 = (String) objLJIIJ;
        if (!a0.LJJJIL(str22)) {
            AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel2 = this.LLILLL;
            LifecycleOwner lifecycleOwner = this.LLJJI;
            aIGCOfflineProcessingViewModel2.getClass();
            aIGCOfflineProcessingViewModel2.LLILZLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIGCOfflineProcessingViewModel2), null, null, new C544480LXa(aIGCOfflineProcessingViewModel2, str22, lifecycleOwner, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationJob$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final ParentTaskInput LIZ(CreativeInfo creativeInfo, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, Map map, boolean z) {
        int iIntValue;
        String str10 = str6;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        String str16 = "";
        if (str15 == null) {
            str15 = "";
        }
        if (str14 == null) {
            str14 = "";
        }
        if (str13 == null) {
            str13 = "";
        }
        if (str12 == null) {
            str12 = "";
        }
        String str17 = "image2video";
        if (str11 == null) {
            str11 = "image2video";
        }
        if (str10 == null) {
            str10 = "";
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (str7 != null) {
            str16 = str7;
        }
        if (str8 != null) {
            str17 = str8;
        }
        return new ParentTaskInput(creativeInfo, new CommonParentTaskInput(str13, list, null, null, 0, 0, null, str14, "effect_aigc", str11, null, str15, null, null, str12, iIntValue, str16, str10, str17, map, z, 0, null, null, str9, false, false, null, 0, null, 1054880892, null));
    }
}
