package X;

import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LUO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$observeProgress$1$1$combineFlow$1", f = "Text2ImageListScene.kt", l = {}, m = "invokeSuspend")
public final class C0LUO extends C09AX implements InterfaceC1631620sYq<C0LU9, Integer, InterfaceC1364105Vn<? super Object>, Object> {
    public /* synthetic */ C0LU9 LL;
    public /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C558180Luq LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LUO(C558180Luq c558180Luq, String str, String str2, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LUO> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c558180Luq;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C0LUN c0lun;
        C1C7U.LIZ("Text2ImageListScene@1b50.observeProgress$1$1$combineFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LU9 c0lu9 = this.LL;
        int i = this.LLILLJJLI;
        if (c0lu9 instanceof C0LUC) {
            TextImageTaskInfo textImageTaskInfoLIZIZ = C572250McR.LIZIZ(this.LLILLL.LLLIL().creativeModel.text2ImageModel, this.LLILZ);
            if (textImageTaskInfoLIZIZ != null) {
                textImageTaskInfoLIZIZ.setUri((String) C13LP.LJJJJZI(((C0LUC) c0lu9).LIZ.LIZ));
            }
            C558180Luq.LLLLIL(this.LLILLL, this.LLILZ, this.LLILZIL, EnumC554770LpL.FINISHED, C2286608xc.LJ(100), (String) C13LP.LJJJJZI(((C0LUC) c0lu9).LIZ.LIZ), null, null, 96);
            C2296808zG.LIZJ(this.LLILZLL, null);
            Integer numLJ = C2286608xc.LJ(100);
            C1C7U.LIZIZ("Text2ImageListScene@1b50.observeProgress$1$1$combineFlow$1");
            return numLJ;
        }
        if (c0lu9 instanceof C0LUB) {
            C558180Luq.LLLLIL(this.LLILLL, this.LLILZ, this.LLILZIL, EnumC554770LpL.PENDING, C2286608xc.LJ(i), null, null, null, 112);
            Integer numLJ2 = C2286608xc.LJ(i);
            C1C7U.LIZIZ("Text2ImageListScene@1b50.observeProgress$1$1$combineFlow$1");
            return numLJ2;
        }
        if (c0lu9 instanceof C0LUA) {
            TextImageTaskInfo textImageTaskInfoLIZIZ2 = C572250McR.LIZIZ(this.LLILLL.LLLIL().creativeModel.text2ImageModel, this.LLILZ);
            if (textImageTaskInfoLIZIZ2 != null) {
                C0LU8 c0lu8 = ((C0LUA) c0lu9).LIZIZ;
                if ((c0lu8 instanceof C0LUN) && (c0lun = (C0LUN) c0lu8) != null) {
                    string = C2286608xc.LJ(c0lun.getErrorCode()).toString();
                } else {
                    string = null;
                }
                textImageTaskInfoLIZIZ2.setFailReason(string);
            }
            C558180Luq.LLLLIL(this.LLILLL, this.LLILZ, this.LLILZIL, EnumC554770LpL.ERROR, null, null, ((C0LUA) c0lu9).LIZIZ, null, 88);
            C2296808zG.LIZJ(this.LLILZLL, null);
            Integer numLJ3 = C2286608xc.LJ(0);
            C1C7U.LIZIZ("Text2ImageListScene@1b50.observeProgress$1$1$combineFlow$1");
            return numLJ3;
        }
        if (c0lu9 instanceof C0LU3) {
            C558180Luq.LLLLIL(this.LLILLL, this.LLILZ, this.LLILZIL, EnumC554770LpL.ERROR, null, null, ((C0LU3) c0lu9).LIZ.LIZIZ, null, 88);
            C2296808zG.LIZJ(this.LLILZLL, null);
            Integer numLJ4 = C2286608xc.LJ(0);
            C1C7U.LIZIZ("Text2ImageListScene@1b50.observeProgress$1$1$combineFlow$1");
            return numLJ4;
        }
        if (Intrinsics.LJFF(c0lu9, C0LUD.LIZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("Text2ImageListScene@1b50.observeProgress$1$1$combineFlow$1");
            return unit;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C0LU9 c0lu9, Integer num, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C0LUO c0luo = new C0LUO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0luo.LL = c0lu9;
        c0luo.LLILLJJLI = iIntValue;
        return c0luo.invokeSuspend(Unit.LIZ);
    }
}
