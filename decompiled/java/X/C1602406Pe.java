package X;

import com.ss.android.ugc.aweme.im.common.setting.StreakMilestoneUnlockAnimationElement;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StreakStoryFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.service.alphavideo.AmbientDataSourceHelper;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.06Pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel$checkStreakUnlockAnim$1", f = "ChatRoomStreakViewModel.kt", l = {304}, m = "invokeSuspend")
public final class C1602406Pe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ ChatRoomStreakViewModel LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602406Pe(ChatRoomStreakViewModel chatRoomStreakViewModel, Integer num, InterfaceC1364105Vn<? super C1602406Pe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = chatRoomStreakViewModel;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1602406Pe(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        DataSource dataSourceLIZIZ;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Pair<Boolean, Boolean> pairLIZ;
        Pair pair;
        int iIntValue;
        Object objT = obj;
        C1C7U.LIZ("ChatRoomStreakViewModel@6295.checkStreakUnlockAnim$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LLILLL;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.LLILLJJLI;
                i = this.LL;
                C155000ia.LIZIZ(objT);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objT);
            if (!a0.LJJIIZI(this.LLILZ.xQ2(), ":", false)) {
                i = AbstractC1711506n3.LIZIZ;
            } else {
                i = AbstractC1711506n3.LIZ;
            }
            StreakStoryFeature streakStoryFeatureLIZ = StreakStoryFeature.LIZ.LIZ();
            if (streakStoryFeatureLIZ != null && streakStoryFeatureLIZ.LIZJ(i)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            IStreakService iStreakServiceYQ2 = this.LLILZ.yQ2();
            String strXQ2 = this.LLILZ.xQ2();
            Integer num = this.LLILZIL;
            this.LL = i;
            this.LLILLJJLI = i2;
            this.LLILLL = 1;
            objT = iStreakServiceYQ2.T(num, strXQ2, this);
            if (objT == objLJFF) {
                C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.checkStreakUnlockAnim$1");
                return objLJFF;
            }
        }
        C1602706Ph c1602706PhLIZ = (C1602706Ph) objT;
        if (c1602706PhLIZ == null) {
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.LIZ(6, "Streak", "ChatRoomStreakViewModel: checkStreakUnlockAnimInnerV2: res info is null");
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.checkStreakUnlockAnim$1");
            return unit;
        }
        if (((Boolean) C06QA.LIZIZ.getValue()).booleanValue()) {
            this.LLILZ.getClass();
            if (c1602706PhLIZ.LJIIIZ) {
                C1603606Pq.LIZ.getClass();
                pair = new Pair(C1603606Pq.LIZ().fakeMilestoneLevelArray, C1603606Pq.LIZIZ.fakeMilestoneLevelArray);
            } else {
                C1603606Pq.LIZ.getClass();
                List<StreakMilestoneUnlockAnimationElement> list = C1603606Pq.LIZ().elementList;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<StreakMilestoneUnlockAnimationElement> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C13LP.LJJJLL(it2.next().levelArray));
                }
                C1603606Pq.LIZ.getClass();
                List<StreakMilestoneUnlockAnimationElement> list2 = C1603606Pq.LIZIZ.elementList;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<StreakMilestoneUnlockAnimationElement> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(C13LP.LJJJLL(it3.next().levelArray));
                }
                pair = new Pair(arrayList, arrayList2);
            }
            List list3 = (List) pair.getFirst();
            List list4 = (List) pair.getSecond();
            if (!Intrinsics.LJFF(list3, list4)) {
                Integer num2 = (Integer) C13LP.LJJJLZIJ(list3.indexOf(Integer.valueOf(c1602706PhLIZ.LIZ)), list4);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = c1602706PhLIZ.LIZ;
                }
                c1602706PhLIZ = C1602706Ph.LIZ(c1602706PhLIZ, iIntValue, 0, 1022);
            }
        }
        int i4 = c1602706PhLIZ.LIZ;
        int i5 = c1602706PhLIZ.LIZIZ;
        boolean z10 = c1602706PhLIZ.LIZJ;
        boolean z11 = c1602706PhLIZ.LIZLLL;
        boolean z12 = c1602706PhLIZ.LJ;
        String str2 = c1602706PhLIZ.LJFF;
        String str3 = c1602706PhLIZ.LJI;
        String str4 = c1602706PhLIZ.LJII;
        String str5 = c1602706PhLIZ.LJIIIIZZ;
        boolean z13 = c1602706PhLIZ.LJIIIZ;
        if (!C06H6.LIZ() && this.LLILZ.yQ2().i(i4, this.LLILZ.xQ2())) {
            z = true;
        } else {
            z = false;
        }
        if (i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C013C c013c = new C013C();
        if (i2 != 0 && z2 && !z && z10 && !z11) {
            z11 = false;
            z3 = true;
        } else {
            z3 = false;
        }
        c013c.element = z3;
        if (i == AbstractC1711506n3.LIZ) {
            StreakStoryFeature streakStoryFeatureLIZ2 = StreakStoryFeature.LIZ.LIZ();
            if (streakStoryFeatureLIZ2 != null && (pairLIZ = streakStoryFeatureLIZ2.LIZ()) != null) {
                boolean zBooleanValue = pairLIZ.getSecond().booleanValue();
                z4 = true;
                if (!zBooleanValue) {
                }
            } else {
                z4 = true;
            }
            if (c013c.element && !z13) {
                z9 = true;
            } else {
                z9 = false;
            }
            c013c.element = z9;
        } else {
            z4 = true;
        }
        if (!z12) {
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
            if (iMALogApiLIZ2 != null) {
                iMALogApiLIZ2.LIZ(6, "Streak", "ChatRoomStreakViewModel: checkStreakUnlockAnimInnerV2: res info's configFilePath is null");
            }
            String strXQ22 = this.LLILZ.xQ2();
            if (i2 == 0) {
                z4 = false;
            }
            C06KD.LIZ(strXQ22, i, true, 1, z4, i4, z, z10, z11, c013c.element, i5);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.checkStreakUnlockAnim$1");
            return unit2;
        }
        C1231704rr c1231704rr = new C1231704rr("PostToStory", null, 6);
        if (z10) {
            dataSourceLIZIZ = AmbientDataSourceHelper.LIZIZ.LIZ(str2, str3);
        } else {
            AmbientDataSourceHelper ambientDataSourceHelper = AmbientDataSourceHelper.LIZIZ;
            if (str5 == null) {
                str = "";
            } else {
                str = str5;
            }
            ambientDataSourceHelper.getClass();
            dataSourceLIZIZ = AmbientDataSourceHelper.LIZIZ(str, null);
        }
        if (dataSourceLIZIZ == null) {
            ChatRoomStreakViewModel chatRoomStreakViewModel = this.LLILZ;
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ3 = C0Z53.LIZ();
            if (iMALogApiLIZ3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ChatRoomStreakViewModel: checkStreakUnlockAnimInnerV2: data source is null, resName=");
                sbLIZ.append(str5);
                iMALogApiLIZ3.LIZ(6, "Streak", C2188811AlT.LIZIZ(sbLIZ));
            }
            String strXQ23 = chatRoomStreakViewModel.xQ2();
            if (i2 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            C06KD.LIZ(strXQ23, i, true, 2, z8, i4, z, z10, z11, c013c.element, i5);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.checkStreakUnlockAnim$1");
            return unit3;
        }
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ4 = C0Z53.LIZ();
        if (iMALogApiLIZ4 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkStreakUnlockAnimInnerV2 result=");
            sbLIZ2.append(c013c.element);
            sbLIZ2.append(", hasStreakStoryPosted=");
            sbLIZ2.append(z);
            sbLIZ2.append(", isStoryRelatedExperimentEnable=");
            if (i2 != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            sbLIZ2.append(z7);
            sbLIZ2.append(", isLevelLegal=");
            sbLIZ2.append(z2);
            sbLIZ2.append(", isMilestoneRes=");
            sbLIZ2.append(z10);
            sbLIZ2.append(", isRestore=");
            sbLIZ2.append(z11);
            iMALogApiLIZ4.LIZ(6, "Streak", C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("checkStreakUnlockAnimInnerV2 result=");
        sbLIZ3.append(c013c.element);
        sbLIZ3.append(", hasStreakStoryPosted=");
        sbLIZ3.append(z);
        sbLIZ3.append(", isStoryRelatedExperimentEnable=");
        if (i2 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        sbLIZ3.append(z5);
        sbLIZ3.append(", isLevelLegal=");
        sbLIZ3.append(z2);
        sbLIZ3.append(", isMilestoneRes=");
        sbLIZ3.append(z10);
        sbLIZ3.append(", isRestore=");
        sbLIZ3.append(z11);
        C2188811AlT.LIZIZ(sbLIZ3);
        c1231704rr.LIZIZ();
        ChatRoomStreakViewModel chatRoomStreakViewModel2 = this.LLILZ;
        InterfaceC1602806Pi interfaceC1602806Pi = chatRoomStreakViewModel2.LL;
        if (i2 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        interfaceC1602806Pi.s30(new C1602506Pf(chatRoomStreakViewModel2, i4, i5, c013c, c1231704rr, i, z6, z, z10, z11, str4, dataSourceLIZIZ, z13));
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.checkStreakUnlockAnim$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
