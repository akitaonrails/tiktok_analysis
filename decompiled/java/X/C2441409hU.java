package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.09hU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostRecyclerViewHolder$fetchColorFromBitmap$1", f = "LiveSfvPostRecyclerViewHolder.kt", l = {263}, m = "invokeSuspend")
public final class C2441409hU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ LiveFragmentDetail LLILLL;
    public final /* synthetic */ C1838930xxD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441409hU(Bitmap bitmap, LiveFragmentDetail liveFragmentDetail, C1838930xxD c1838930xxD, InterfaceC1364105Vn<? super C2441409hU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = liveFragmentDetail;
        this.LLILZ = c1838930xxD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2441409hU(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        C1C7U.LIZ("LiveSfvPostRecyclerViewHolder@e8fa.fetchColorFromBitmap$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(this.LLILLJJLI, new Rect(0, 0, this.LLILLJJLI.getWidth(), this.LLILLJJLI.getHeight())));
            c204674156yLIZ.LJ(0.03f, 0.4f, 0.3f, 1.0f, 0.3f);
            c204674156yLIZ.LJFF(13.0f);
            c204674156yLIZ.LJI(0.0f);
            LiveFragmentDetail liveFragmentDetail = this.LLILLL;
            int[] iArrLIZ = c204674156yLIZ.LIZ();
            if (6 >= iArrLIZ.length) {
                arrayList = C13LQ.LJJLJ(iArrLIZ);
            } else {
                arrayList = new ArrayList(6);
                int i2 = 0;
                for (int i3 : iArrLIZ) {
                    arrayList.add(Integer.valueOf(i3));
                    i2++;
                    if (i2 == 6) {
                        break;
                    }
                }
            }
            C1838930xxD c1838930xxD = this.LLILZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                c1838930xxD.getClass();
                StringBuffer stringBuffer = new StringBuffer();
                String hexString = Integer.toHexString(Color.red(iIntValue));
                String hexString2 = Integer.toHexString(Color.green(iIntValue));
                String hexString3 = Integer.toHexString(Color.blue(iIntValue));
                if (hexString.length() == 1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('0');
                    sbLIZ2.append(hexString);
                    hexString = C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (hexString2.length() == 1) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('0');
                    sbLIZ3.append(hexString2);
                    hexString2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (hexString3.length() == 1) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append('0');
                    sbLIZ4.append(hexString3);
                    hexString3 = C2188811AlT.LIZIZ(sbLIZ4);
                }
                stringBuffer.append(hexString);
                stringBuffer.append(hexString2);
                stringBuffer.append(hexString3);
                sbLIZ.append(stringBuffer.toString());
                arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            liveFragmentDetail.coverThemeColor = new ArrayList(arrayList2);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2441509hV c2441509hV = new C2441509hV(this.LLILZ, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c2441509hV) == objLJFF) {
                C1C7U.LIZIZ("LiveSfvPostRecyclerViewHolder@e8fa.fetchColorFromBitmap$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSfvPostRecyclerViewHolder@e8fa.fetchColorFromBitmap$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
