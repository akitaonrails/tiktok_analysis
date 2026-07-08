package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS53S0310000_12;
import kotlin.jvm.internal.AwS55S0010000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9B, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U9B extends AbstractC761920Tug<RecyclerView.ViewHolder, LiveEffect> {
    public static final /* synthetic */ int LLJJJ = 0;
    public final DataChannel LLILLJJLI;
    public final StickerEffectViewModel LLILLL;
    public LiveEffect LLILZ;
    public LiveEffect LLILZIL;
    public boolean LLILZLL;
    public Function2<? super LiveEffect, ? super LiveEffect, Unit> LLIZ;
    public LiveEffect LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C1336240ksQ LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public AnonymousClass0956 LLJJ;
    public boolean LLJJI;
    public C0UBH LLJJIII;
    public boolean LLJJIJI;
    public final C0U6O LLJJIJIIJIL;
    public final C0U6P LLJJIJIL;

    public final void LLLLZLLLI() {
        Boolean boolValueOf;
        this.LLJI = true;
        C1336240ksQ c1336240ksQ = this.LLJIJIL;
        if (c1336240ksQ != null) {
            boolValueOf = Boolean.valueOf(c1336240ksQ.LJIILIIL && !c1336240ksQ.LJIIL);
        } else {
            boolValueOf = null;
        }
        this.LLJJIJI = C500260Jjc.LJJJI(boolValueOf);
        C1336240ksQ c1336240ksQ2 = this.LLJIJIL;
        if (c1336240ksQ2 != null) {
            c1336240ksQ2.LIZ();
        }
    }

    public final void LLLZ() {
        this.LLJI = false;
        if (this.LLJJIJI) {
            C1336240ksQ c1336240ksQ = this.LLJIJIL;
            if (c1336240ksQ != null) {
                c1336240ksQ.LIZJ();
            }
            this.LLJJIJI = false;
        }
        if (this.LLJILJIL) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            C0UC4.LJJIIZ(C0U9D.LIZ, this.LLILLJJLI);
        }
        LLZL();
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    public final int LLLLLLLLLL() {
        return ((Number) C500260Jjc.LJI(this.LL, new AwS591S0100000_12(this, 670)).getSecond()).intValue();
    }

    public final void LLLZIL() {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(StickerSelectChannel.class, this, new AwS591S0100000_12(this, 671));
            dataChannel.CQ2(StickerCancelChannel.class, this, new AwS591S0100000_12(this, 672));
            dataChannel.DQ2(GreenScreenCreatorBlockChannel.class, this, new AwS591S0100000_12(this, 673));
        }
        DataChannelGlobal.LLILZ.CQ2(BroadcastSceneGlobalChannel.class, this, new AwS591S0100000_12(this, 674));
        this.LLJJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LLILLL), null, null, new C761500Tu0(this, null), 3);
    }

    public final void LLLZLL() {
        DataChannelGlobal.LLILZ.zQ2(this);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1336240ksQ c1336240ksQ = this.LLJIJIL;
        if (c1336240ksQ != null) {
            c1336240ksQ.LIZ();
        }
        this.LLJIJIL = null;
        this.LLILZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = false;
        this.LLJI = false;
        this.LLJILJIL = false;
    }

    public final void LLZL() {
        int i = 0;
        for (Object obj : (ArrayList) this.LL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            LiveEffect liveEffect = (LiveEffect) obj;
            if (liveEffect.LLJZ()) {
                if (LLLLLLZZ(liveEffect)) {
                    if (i < ((ArrayList) this.LL).size()) {
                        notifyItemChanged(i, "item_lock");
                    }
                } else if (i < ((ArrayList) this.LL).size()) {
                    notifyItemChanged(i, "item_unlock");
                }
            }
            i = i2;
        }
    }

    public static final void LLLLLZIL(RecyclerView.ViewHolder viewHolder) {
        C0U5R c0u5r;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null) {
            c0u5r.I5();
            C500260Jjc.LLFFF(c0u5r.LLILZIL);
        }
    }

    public final void LLLLLLIL(LiveEffect liveEffect) {
        String panel = liveEffect.getPanel();
        String str = this.LLJILJILJ;
        String str2 = C0UD4.LJ;
        int i = 0;
        if (!Intrinsics.LJFF(str, str2) ? !Intrinsics.LJFF(panel, this.LLJILJILJ) : !(Intrinsics.LJFF(panel, str2) || Intrinsics.LJFF(panel, C0UD4.LIZIZ))) {
            if (!liveEffect.LJJIJIIJI()) {
                return;
            }
        }
        LLZILL(false, false);
        LiveEffect liveEffect2 = this.LLILZ;
        Iterator it2 = ((ArrayList) this.LL).iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), liveEffect2)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (liveEffect.LLLIIII()) {
            Iterator it3 = ((ArrayList) this.LL).iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((LiveEffect) it3.next()).getResourceId(), liveEffect.LLILII())) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            Iterator it4 = ((ArrayList) this.LL).iterator();
            while (it4.hasNext()) {
                if (Intrinsics.LJFF(it4.next(), liveEffect)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        }
        Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        this.LLILZ = liveEffect;
        if (iIntValue != iIntValue2) {
            if (iIntValue != -1) {
                LLLJ(iIntValue);
            }
            if (iIntValue2 != -1) {
                LLLILZ(iIntValue2);
            }
        }
    }

    public final int LLLLLLL(String str) {
        Iterator it2 = ((ArrayList) this.LL).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(((LiveEffect) it2.next()).getResourceId(), str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final int LLLLLLLLL(LiveEffect liveEffect) {
        int i = 0;
        for (Object obj : (ArrayList) this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                LiveEffect liveEffect2 = (LiveEffect) obj;
                UrlModel urlModel = LiveEffect.LIZLLL;
                if (C0UCX.LIZ(liveEffect2, liveEffect) && liveEffect != null) {
                    C20441214yg.LIZIZ("EffectMemoryOpt", "found same");
                    return i;
                }
                if (C767250U7v.LJII(liveEffect2, liveEffect)) {
                    C20441214yg.LIZIZ("EffectMemoryOpt", "found Parent");
                    return i;
                }
                if (C767250U7v.LJIIIIZZ(liveEffect) && C767250U7v.LJIIIIZZ(liveEffect2)) {
                    C20441214yg.LIZIZ("EffectMemoryOpt", "found None");
                    return i;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return -1;
    }

    public final void LLLLLLLZIL(List<LiveEffect> list) {
        LiveEffect liveEffectLIZ;
        if (this.LLJ && Intrinsics.LJFF(this.LLJILJILJ, C0UD4.LIZIZ) && (liveEffectLIZ = C0U9D.LIZ(list, this.LLJ)) != null && C0U9D.LIZ != null) {
            ((ArrayList) list).remove(liveEffectLIZ);
            ListProtector.add(list, 0, liveEffectLIZ);
        }
    }

    public final boolean LLLLLLZ(LiveEffect liveEffect) {
        if (LLLLLLZZ(liveEffect) || (this.LLJJI && C500260Jjc.LJJJI(Boolean.valueOf(liveEffect.LJJJJLL())))) {
            return true;
        }
        return false;
    }

    public final boolean LLLLLLZZ(LiveEffect liveEffect) {
        Boolean boolValueOf;
        C1081600eFi c1081600eFi;
        if (!liveEffect.LLJZ()) {
            return false;
        }
        EnumC768840UDy enumC768840UDy = (EnumC768840UDy) DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class);
        Boolean boolValueOf2 = null;
        if (enumC768840UDy != null) {
            boolValueOf = Boolean.valueOf(enumC768840UDy.isLink());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (c1081600eFi = (C1081600eFi) dataChannel.gg0(MultiLiveRTCLayoutChannel.class)) != null) {
            boolValueOf2 = Boolean.valueOf(c1081600eFi.LIZ());
        }
        boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf2);
        if (!zLJJJI && !zLJJIFFI) {
            return false;
        }
        return true;
    }

    public final void LLLZIIL(LiveEffect liveEffect) {
        this.LLIZLLLIL = null;
        LiveEffect liveEffect2 = this.LLILZ;
        this.LLILZ = liveEffect;
        UrlModel urlModel = LiveEffect.LIZLLL;
        if (C0UCX.LIZ(liveEffect, liveEffect2)) {
            this.LLILZ = null;
        }
        if (liveEffect2 != null && ((ArrayList) this.LL).contains(liveEffect2)) {
            LLLJ(((ArrayList) this.LL).indexOf(liveEffect2));
        } else if (C767250U7v.LJIIIIZZ(liveEffect2)) {
            LLZILL(false, false);
        }
        C768430UCj c768430UCj = C768430UCj.LIZ;
        C768430UCj.LJ(liveEffect, 0L, this instanceof C0U9F, C0UD4.LIZIZ);
        Function2<? super LiveEffect, ? super LiveEffect, Unit> function2 = this.LLIZ;
        if (function2 != null) {
            function2.invoke(liveEffect2, this.LLILZ);
        }
        LLLILZ(LLLLLLLLL(this.LLILZ));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void LLLZZIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r12) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U9B.LLLZZIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect):void");
    }

    public final void LLZIL(LiveEffect liveEffect) {
        LiveEffect liveEffect2;
        boolean z;
        String resourceId;
        UrlModel urlModel = LiveEffect.LIZLLL;
        if (!C0UCX.LIZ(this.LLILZ, liveEffect)) {
            LLLJ(LLLLLLLLL(this.LLILZ));
            LiveEffect liveEffect3 = (LiveEffect) DataChannelGlobal.LLILZ.gg0(C931050aKt.class);
            Boolean boolValueOf = null;
            if (liveEffect3 != null) {
                List<LiveEffect> listLL = liveEffect3.LL();
                if (listLL != null && !listLL.isEmpty()) {
                    Iterator<LiveEffect> it2 = listLL.iterator();
                    while (it2.hasNext()) {
                        String resourceId2 = it2.next().getResourceId();
                        if (liveEffect != null) {
                            resourceId = liveEffect.getResourceId();
                        } else {
                            resourceId = null;
                        }
                        if (Intrinsics.LJFF(resourceId2, resourceId)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    z = false;
                    boolValueOf = Boolean.valueOf(z);
                }
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                liveEffect2 = (LiveEffect) DataChannelGlobal.LLILZ.gg0(C931050aKt.class);
            } else {
                liveEffect2 = liveEffect;
            }
            this.LLILZ = liveEffect2;
        }
        LLLILZ(LLLLLLLLL(liveEffect));
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        if (((LiveEffect) ListProtector.get(this.LL, i)).LJLIL().getValue() == C0U9E.RECOMMEND_STICKER.getValue() && (!this.LLJ || !Intrinsics.LJFF(this.LLJILJILJ, C0UD4.LIZIZ))) {
            return C0U9E.NORMAL.getValue();
        }
        return ((LiveEffect) ListProtector.get(this.LL, i)).LJLIL().getValue();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C0U9K) {
            C1336240ksQ c1336240ksQ = ((C0U9K) viewHolder).LLJJIII;
            if (c1336240ksQ != null) {
                c1336240ksQ.LIZJ();
            }
            this.LLJILJIL = true;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C0U9K) {
            C1336240ksQ c1336240ksQ = ((C0U9K) viewHolder).LLJJIII;
            if (c1336240ksQ != null) {
                c1336240ksQ.LIZ();
            }
            this.LLJILJIL = false;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C0U9G c0u9g;
        super.onViewRecycled(viewHolder);
        if ((viewHolder instanceof C0U9G) && (c0u9g = (C0U9G) viewHolder) != null && (c0u9g instanceof C0U9K)) {
            C0U9K c0u9k = (C0U9K) c0u9g;
            C1336240ksQ c1336240ksQ = c0u9k.LLJJIII;
            if (c1336240ksQ != null) {
                c1336240ksQ.LIZ();
            }
            c0u9k.LLJJIII = null;
            this.LLJIJIL = null;
            c0u9g.LL.setController(null);
            c0u9k.LLJJIJI = -1L;
            this.LLJILJIL = false;
        }
        C0IK5.LIZLLL(viewHolder);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0U6O] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0U6P] */
    public C0U9B(DataChannel dataChannel, StickerEffectViewModel stickerEffectViewModel) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = stickerEffectViewModel;
        C497740JfY.LIZ(54.0f);
        C497740JfY.LIZ(60.0f);
        this.LLJILJILJ = C0UD4.LIZIZ;
        this.LLJJIJIIJIL = new C0U45() { // from class: X.0U6O
            public long LIZ;
            public long LIZIZ = -1;

            /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
            @Override // X.C0U45
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r16) {
                /*
                    Method dump skipped, instruction units count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0U6O.LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect):void");
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect) {
                LiveEffect liveEffectLIZJ = C767250U7v.LIZJ(liveEffect, this.LIZJ.LL);
                if (liveEffectLIZJ != null) {
                    liveEffectLIZJ.LJJLIL(false);
                    liveEffectLIZJ.LJLILLLLZI(true);
                } else {
                    liveEffectLIZJ = null;
                }
                if (this.LIZJ.LLJI) {
                    return;
                }
                this.LIZ = System.currentTimeMillis();
                this.LIZJ.LLLII(liveEffectLIZJ);
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
                Integer numValueOf;
                LiveEffect liveEffectLIZJ = C767250U7v.LIZJ(liveEffect, this.LIZJ.LL);
                String msg = null;
                if (liveEffectLIZJ != null) {
                    liveEffectLIZJ.LJJLIL(false);
                    liveEffectLIZJ.LJLILLLLZI(false);
                } else {
                    liveEffectLIZJ = null;
                }
                C0U9B c0u9b = this.LIZJ;
                if (c0u9b.LLJI) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
                long j = this.LIZIZ;
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    msg = exceptionResult.getMsg();
                } else {
                    numValueOf = null;
                }
                c0u9b.LLLZZ(liveEffectLIZJ, false, jCurrentTimeMillis, j, numValueOf, msg);
                this.LIZJ.LLLI(liveEffectLIZJ);
                C766270U4b.LIZLLL(2131842713);
            }

            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
                this.LIZIZ = j;
            }
        };
        this.LLJJIJIL = new C0U45() { // from class: X.0U6P
            public long LIZ;
            public long LIZIZ = -1;

            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect) {
                String strLJJLIIIJ;
                boolean z;
                C767720U9q logParams;
                UrlModel fileUrl;
                List<String> list;
                LiveEffect liveEffect2 = null;
                if (liveEffect != null && (fileUrl = liveEffect.getFileUrl()) != null && (list = fileUrl.urlList) != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS245S0000000_12.get$arr$(100), 31);
                } else {
                    strLJJLIIIJ = null;
                }
                C20441214yg.LIZIZ("EffectMonitor#downloadSuc", String.valueOf(strLJJLIIIJ));
                if (liveEffect != null) {
                    liveEffect.LJJLIL(true);
                    liveEffect.LJLILLLLZI(false);
                }
                C0U9B c0u9b = this.LIZJ;
                if (c0u9b.LLJI) {
                    return;
                }
                c0u9b.LLLZZ(liveEffect, true, System.currentTimeMillis() - this.LIZ, this.LIZIZ, -1, "");
                this.LIZJ.LLLIILIL(liveEffect);
                UrlModel urlModel = LiveEffect.LIZLLL;
                if (C0UCX.LIZ(this.LIZJ.LLIZLLLIL, liveEffect)) {
                    C0U9B c0u9b2 = this.LIZJ;
                    if (c0u9b2.LLIZ != null) {
                        LiveEffect liveEffect3 = c0u9b2.LLILZ;
                        if (liveEffect != null) {
                            C767720U9q logParams2 = liveEffect.getLogParams();
                            LiveEffect liveEffect4 = c0u9b2.LLIZLLLIL;
                            if (liveEffect4 != null && (logParams = liveEffect4.getLogParams()) != null) {
                                z = logParams.LIZ;
                            } else {
                                z = false;
                            }
                            logParams2.LIZ = z;
                            liveEffect2 = liveEffect;
                        }
                        c0u9b2.LLILZ = liveEffect2;
                        if (liveEffect3 != null && ((ArrayList) this.LIZJ.LL).contains(liveEffect3)) {
                            C0U9B c0u9b3 = this.LIZJ;
                            c0u9b3.LLLJ(((ArrayList) c0u9b3.LL).indexOf(liveEffect3));
                        } else if (C767250U7v.LJIIIIZZ(liveEffect3)) {
                            this.LIZJ.LLZILL(false, false);
                        }
                        C0U9B c0u9b4 = this.LIZJ;
                        Function2<? super LiveEffect, ? super LiveEffect, Unit> function2 = c0u9b4.LLIZ;
                        if (function2 != null) {
                            function2.invoke(liveEffect3, c0u9b4.LLILZ);
                        }
                        C0U9B c0u9b5 = this.LIZJ;
                        c0u9b5.LLLILZ(((ArrayList) c0u9b5.LL).indexOf(liveEffect));
                    }
                }
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect) {
                int iIndexOf;
                if (liveEffect != null) {
                    liveEffect.LJJLIL(false);
                    liveEffect.LJLILLLLZI(true);
                }
                C0U9B c0u9b = this.LIZJ;
                if (!c0u9b.LLJI && (iIndexOf = ((ArrayList) c0u9b.LL).indexOf(liveEffect)) >= 0) {
                    this.LIZ = System.currentTimeMillis();
                    C0U9B c0u9b2 = this.LIZJ;
                    if (iIndexOf < ((ArrayList) c0u9b2.LL).size()) {
                        c0u9b2.notifyItemChanged(iIndexOf, "item_download_start");
                    }
                }
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
                String msg;
                Integer numValueOf;
                String msg2 = null;
                if (exceptionResult != null) {
                    msg = exceptionResult.getMsg();
                } else {
                    msg = null;
                }
                C20441214yg.LIZIZ("EffectMonitor#downloadFail", String.valueOf(msg));
                if (liveEffect != null) {
                    liveEffect.LJJLIL(false);
                    liveEffect.LJLILLLLZI(false);
                }
                C0U9B c0u9b = this.LIZJ;
                if (c0u9b.LLJI) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
                long j = this.LIZIZ;
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    msg2 = exceptionResult.getMsg();
                } else {
                    numValueOf = null;
                }
                c0u9b.LLLZZ(liveEffect, false, jCurrentTimeMillis, j, numValueOf, msg2);
                int iIndexOf = ((ArrayList) this.LIZJ.LL).indexOf(liveEffect);
                if (iIndexOf >= 0) {
                    C0U9B c0u9b2 = this.LIZJ;
                    if (iIndexOf < ((ArrayList) c0u9b2.LL).size()) {
                        c0u9b2.notifyItemChanged(iIndexOf, "item_download_fail");
                    }
                }
                C766270U4b.LIZLLL(2131842713);
            }

            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
                String resourceId;
                this.LIZIZ = j;
                C0U9B c0u9b = this.LIZJ;
                if (c0u9b.LLJI) {
                    return;
                }
                if (liveEffect != null) {
                    resourceId = liveEffect.getResourceId();
                } else {
                    resourceId = null;
                }
                int iLLLLLLL = c0u9b.LLLLLLL(resourceId);
                if (iLLLLLLL >= 0) {
                    C0U9B c0u9b2 = this.LIZJ;
                    if (iLLLLLLL < ((ArrayList) c0u9b2.LL).size()) {
                        c0u9b2.notifyItemChanged(iLLLLLLL, Integer.valueOf(i));
                    }
                }
            }
        };
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        C1324720kZq c1324720kZq;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null && (c1324720kZq = c0u5r.LL) != null) {
            C786410Ut5.h5(c1324720kZq, 0.4f);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLJI(RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        C1324720kZq c1324720kZq;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null && (c1324720kZq = c0u5r.LL) != null) {
            C786410Ut5.h5(c1324720kZq, 1.0f);
        }
    }

    public void LLLLZ(C0U9G c0u9g, LiveEffect liveEffect) {
        int i;
        Pair pair;
        List<String> list;
        int iIntValue;
        C500260Jjc.LJIILIIL(c0u9g.LLIZ);
        View view = c0u9g.LLILLJJLI;
        if (C768880UEc.LIZ()) {
            i = R.drawable.eew;
        } else {
            i = R.drawable.eev;
        }
        view.setBackgroundResource(i);
        int iIntValue2 = -1;
        if (LiveBroadcastPictureMemOpt.fitEffectPanelIconSize()) {
            LiveBroadcastPictureMemOpt liveBroadcastPictureMemOpt = LiveBroadcastPictureMemOpt.INSTANCE;
            if (liveBroadcastPictureMemOpt.getEffectIconSize() == null) {
                int i2 = c0u9g.LL.getLayoutParams().width;
                int i3 = c0u9g.LL.getLayoutParams().height;
                if (i2 > 0 && i3 > 0) {
                    liveBroadcastPictureMemOpt.setEffectIconSize(new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3)));
                }
            }
            Pair<Integer, Integer> effectIconSize = liveBroadcastPictureMemOpt.getEffectIconSize();
            if (effectIconSize != null) {
                iIntValue = effectIconSize.getFirst().intValue();
            } else {
                iIntValue = -1;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            Pair<Integer, Integer> effectIconSize2 = liveBroadcastPictureMemOpt.getEffectIconSize();
            if (effectIconSize2 != null) {
                iIntValue2 = effectIconSize2.getSecond().intValue();
            }
            pair = new Pair(numValueOf, Integer.valueOf(iIntValue2));
        } else {
            pair = new Pair(-1, -1);
        }
        int iIntValue3 = ((Number) pair.getFirst()).intValue();
        int iIntValue4 = ((Number) pair.getSecond()).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("w,h: (");
        sbLIZ.append(iIntValue3);
        sbLIZ.append(", ");
        sbLIZ.append(iIntValue4);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("EffectMonitor#image", C2188811AlT.LIZIZ(sbLIZ));
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        UrlModel icon = liveEffect.getIcon();
        if (icon != null) {
            list = icon.urlList;
        } else {
            list = null;
        }
        c0jbnLIZ.LJIIIIZZ("live_effect_grid_list", list);
        c0jbnLIZ.LJFF(Boolean.FALSE);
        c0jbnLIZ.LIZLLL(new C786200Usk(liveEffect, 2));
        C1324610kZf c1324610kZfLJIJJ = c0jbnLIZ.LJIJJ(R.drawable.eg5);
        c1324610kZfLJIJJ.LJJIJ(ImageView.ScaleType.FIT_XY);
        c1324610kZfLJIJJ.LJI = iIntValue3;
        c1324610kZfLJIJJ.LJII = iIntValue4;
        c1324610kZfLJIJJ.LJJI(c0u9g.LL);
    }

    public void LLZ(LiveEffect liveEffect, boolean z) {
        String str;
        long jLongValue;
        boolean zBooleanValue;
        String str2;
        if (z) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.SX0(C0U9L.class, Boolean.FALSE);
            }
            C0UC4 c0uc4 = C0UC4.LIZ;
            DataChannel dataChannel2 = this.LLILLJJLI;
            ConcurrentHashMap<String, Boolean> concurrentHashMap = C0UC4.LJIIZILJ;
            boolean zContainsKey = concurrentHashMap.containsKey(liveEffect.getResourceId());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_sticker_click");
            c474500IjALIZ.LJIJJLI(dataChannel2);
            if (!C500260Jjc.LJIIZILJ(dataChannel2) && !C500260Jjc.LJJIJLIJ()) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            c474500IjALIZ.LJJII(str, "is_anchor");
            C767250U7v.LJIIJ(c474500IjALIZ, liveEffect);
            c474500IjALIZ.LJJII(liveEffect.LJLL(), "tab");
            c474500IjALIZ.LJJII("normal", "click_type");
            c474500IjALIZ.LJJIIZ(Boolean.valueOf(zContainsKey), "is_preload", AFwS199S0000000_12.get$arr$(212));
            C5182020e c5182020e = new C5182020e(liveEffect, 157);
            Long l = C0UC4.LJJIII.get(Long.valueOf(liveEffect.getEffectId()));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            c474500IjALIZ.LJJIIZ(Long.valueOf(jLongValue), "favorite_source_app_id", c5182020e);
            AwS55S0010000_12 awS55S0010000_12 = new AwS55S0010000_12(zContainsKey, 2);
            Boolean bool = concurrentHashMap.get(liveEffect.getResourceId());
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c474500IjALIZ.LJJIIZ(Boolean.valueOf(zBooleanValue), "is_downloaded", awS55S0010000_12);
            Map<String, String> map = C0UC4.LJJI;
            if (map != null && map.containsKey("enter_from")) {
                Map<String, String> map2 = C0UC4.LJJI;
                if (map2 == null || (str2 = map2.get("enter_from")) == null) {
                    str2 = "";
                }
                c474500IjALIZ.LJJII(str2, "enter_from");
            } else if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
                c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
            }
            c474500IjALIZ.LIZ();
        }
        LLLZZIL(liveEffect);
    }

    public final void LLZILL(boolean z, boolean z2) {
        int iIntValue = ((Number) C500260Jjc.LJI(this.LL, AFwS245S0000000_12.get$arr$(102)).getSecond()).intValue();
        if (iIntValue >= 0 && iIntValue < ((ArrayList) this.LL).size()) {
            if (z) {
                if (z2) {
                    if (iIntValue < ((ArrayList) this.LL).size()) {
                        notifyItemChanged(iIntValue, "long_item_select");
                        return;
                    }
                    return;
                }
                LLLILZ(iIntValue);
                return;
            }
            if (z2) {
                if (iIntValue >= ((ArrayList) this.LL).size()) {
                    return;
                }
                notifyItemChanged(iIntValue, "long_item_unselect");
                return;
            }
            LLLJ(iIntValue);
        }
    }

    public final void LLZLL(C0U9G c0u9g, LiveEffect liveEffect) {
        int i = 0;
        if (!liveEffect.LJIJJLI() && (this.LLILLL.yQ2(liveEffect) || C0U7C.LJIILIIL(liveEffect))) {
            liveEffect.LJJLIL(true);
            liveEffect.LJLILLLLZI(false);
        }
        C20515815Po c20515815Po = c0u9g.LLILLL;
        if (!liveEffect.LIZLLL()) {
            i = 8;
        }
        int visibility = c20515815Po.getVisibility();
        c20515815Po.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c20515815Po);
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0u9g;
        if (i == C0U9E.RECOMMEND_STICKER.getValue() && this.LLJ && Intrinsics.LJFF(this.LLJILJILJ, C0UD4.LIZIZ)) {
            C01GW c01gw = C485950J3x.LIZ;
            c0u9g = new C0U9K(C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.gey, viewGroup, false));
        } else {
            C01GW c01gw2 = C485950J3x.LIZ;
            c0u9g = new C0U9G(C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.gey, viewGroup, false));
        }
        try {
            View view = c0u9g.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u9g.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u9g.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0u9g.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u9g.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u9g.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0u9g.getClass().getName();
        return c0u9g;
    }

    public static final void LLLLLZ(ImageModel imageModel, View view, ImageView imageView) {
        if (view != null && imageView != null) {
            C500260Jjc.LLFFF(view);
            C500260Jjc.LLFFF(imageView);
            C1324610kZf c1324610kZfLIZ = C1819620xS4.LIZ().LIZ(imageView.getWidth(), imageView.getHeight());
            c1324610kZfLIZ.LJIIIZ(imageModel);
            c1324610kZfLIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZ.LJJ = Boolean.FALSE;
            c1324610kZfLIZ.LJJI(imageView);
        }
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLJL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLZIL(viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null) {
            C500260Jjc.LJIILLIIL(c0u5r.LLILLL);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null) {
            C500260Jjc.LLFFF(c0u5r.LLILLL);
            c0u5r.LLILLL.setProgress(0);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIIIILLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null) {
            C500260Jjc.LJIILLIIL(c0u5r.LLILLL);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIIL(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
        C0U9G c0u9g;
        LiveEffect liveEffect = (LiveEffect) obj;
        if ((viewHolder instanceof C0U9G) && (c0u9g = (C0U9G) viewHolder) != null) {
            LLZLL(c0u9g, liveEffect);
            if (i >= 0) {
                c0u9g.LLILLL.setProgress(i);
            }
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null) {
            C500260Jjc.LJIILIIL(c0u5r.LLILZIL);
        }
    }

    @Override // X.AbstractC761920Tug
    /* JADX INFO: renamed from: LLLLZI, reason: merged with bridge method [inline-methods] */
    public void LLLLL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        C0U5R c0u5r;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShortCut: ");
        sbLIZ.append(viewHolder.getClass().getSimpleName());
        C20441214yg.LIZIZ("EffectMonitor#select", C2188811AlT.LIZIZ(sbLIZ));
        if ((viewHolder instanceof C0U9K) && this.LLJ && !this.LLJI) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            if (C500260Jjc.LJJJI(Boolean.valueOf(liveEffect.getLogParams().LIZIZ))) {
                C0UC4.LJII = C0UC4.LJJIJIIJIL(liveEffect);
            }
            C20337914i1<Set<String>> c20337914i1 = InterfaceC766480U4w.LJJIJ;
            c20337914i1.LIZIZ().add(liveEffect.getResourceId());
            c20337914i1.LIZJ();
        }
        View view = null;
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null) {
            view = c0u5r.LLILLJJLI;
        }
        C500260Jjc.LLFFF(view);
    }

    @Override // X.AbstractC761920Tug
    /* JADX INFO: renamed from: LLLLZIL, reason: merged with bridge method [inline-methods] */
    public void LLLLLJIL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        C0U5R c0u5r;
        String str;
        if (viewHolder instanceof C0U9K) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            String resourceId = liveEffect.getResourceId();
            C0UC8 c0uc8 = C0UC4.LJII;
            if (c0uc8 != null) {
                str = c0uc8.LIZIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(resourceId, str)) {
                C0UC4.LJII = null;
            }
        }
        if ((viewHolder instanceof C0U9G) && (c0u5r = (C0U5R) viewHolder) != null) {
            if (LLLLLLZ(liveEffect)) {
                LLLLLZIL(viewHolder);
            }
            C500260Jjc.LJIILLIIL(c0u5r.LLILLJJLI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0279  */
    @Override // X.AbstractC761920Tug
    /* JADX INFO: renamed from: LLLLZLL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLLLLL(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, final com.bytedance.android.livesdkapi.depend.model.LiveEffect r14, int r15) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U9B.LLLLLL(androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bytedance.android.livesdkapi.depend.model.LiveEffect, int):void");
    }

    public boolean LLLLZLLIL(LiveEffect liveEffect, RecyclerView.ViewHolder viewHolder, boolean z) {
        String str;
        if (C20588315hJ.LLILLL) {
            return false;
        }
        if (this.LLJJI && C500260Jjc.LJJJI(Boolean.valueOf(liveEffect.LJJJJLL()))) {
            UrlModel urlModel = LiveEffect.LIZLLL;
            if (!C0UCX.LIZ(liveEffect, this.LLILZ)) {
                DataChannel dataChannel = this.LLILLJJLI;
                if (dataChannel == null || (str = (String) dataChannel.gg0(C760000Tra.class)) == null) {
                    str = "";
                }
                C766270U4b.LJIILJJIL(C500260Jjc.LJ(viewHolder.itemView.getContext()), str);
                return false;
            }
        }
        if (LLLLLLZZ(liveEffect)) {
            C766270U4b.LIZLLL(2131841649);
            return false;
        }
        Context context = viewHolder.itemView.getContext();
        C013C c013c = new C013C();
        C1828990xhB c1828990xhB = C1828990xhB.LIZ;
        DataChannel dataChannel2 = this.LLILLJJLI;
        AwS53S0310000_12 awS53S0310000_12 = new AwS53S0310000_12(c013c, this, liveEffect, z, 1);
        c1828990xhB.getClass();
        C1828990xhB.LIZ(context, dataChannel2, "sticker", liveEffect, awS53S0310000_12, null);
        return c013c.element;
    }

    public final void LLLZLZ(long j, LiveEffect liveEffect, boolean z) {
        Object obj;
        if (AbstractC19994813Le.Default.nextFloat() < 0.002f) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_cover_download_time");
            c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
            C767250U7v.LJIIJ(c474500IjALIZ, liveEffect);
            C0UBH c0ubh = this.LLJJIII;
            if (c0ubh != null) {
                obj = c0ubh.LIZIZ;
            } else {
                obj = null;
            }
            c474500IjALIZ.LJJII(obj, "tab");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_finish_download");
            c474500IjALIZ.LJJII(Long.valueOf(j), "use_time");
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLI(java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r21, boolean r22, com.bytedance.android.livesdkapi.depend.model.LiveEffect r23, java.lang.String r24, android.content.Context r25) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U9B.LLZLI(java.util.List, boolean, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, android.content.Context):void");
    }

    public void LLLZZ(LiveEffect liveEffect, boolean z, long j, long j2, Integer num, String str) {
        if (z && liveEffect != null) {
            C768430UCj c768430UCj = C768430UCj.LIZ;
            C768430UCj.LJ(liveEffect, j, false, this.LLJILJILJ);
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJJ(this.LLILLJJLI, liveEffect, z, j, j2, num, str, null, null);
    }
}
