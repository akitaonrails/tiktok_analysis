package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM$generatorBitmap$1$1", f = "TakoMultipleSelectVM.kt", l = {190}, m = "invokeSuspend")
public final class C2156908ch extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Pair<Boolean, Bitmap>> LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156908ch(InterfaceC665370Q7z interfaceC665370Q7z, List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2156908ch(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.0Gzf] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        C1C7U.LIZ("TakoMultipleSelectVM@4cd6.generatorBitmap$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                final List<Pair<Boolean, Bitmap>> list = this.LLILLJJLI;
                final InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
                ?? r2 = new Object(interfaceC665370Q7z, list) { // from class: X.0Gzf
                    public final List<Pair<Boolean, Bitmap>> LIZ;
                    public final InterfaceC665370Q7z LIZIZ;
                    public final int LIZJ;
                    public final int LIZLLL;
                    public final int LJ;
                    public final int LJFF;
                    public final int LJI;
                    public final ITakoAIBotUIAbility LJII;

                    public final Object LIZ() {
                        String str;
                        boolean z;
                        Activity activityLIZIZ2;
                        Integer numLIZJ;
                        Activity activityLIZIZ3;
                        AIBotInfo botInfo;
                        ITakoAIBotUIAbility iTakoAIBotUIAbility = this.LJII;
                        if (iTakoAIBotUIAbility == null || (botInfo = iTakoAIBotUIAbility.getBotInfo()) == null || (str = botInfo.botName) == null) {
                            str = "";
                        }
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        View viewSd = C786410Ut5.Sd(R.layout.fq7, C786410Ut5.ne(abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZIZ() : null), null);
                        TextView textView = (TextView) viewSd.findViewById(R.id.c_r);
                        if (textView != null) {
                            textView.setText(str);
                        }
                        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.bh2);
                        if (tuxIconView != null) {
                            C1857680yRS c1857680yRS = C1857680yRS.LIZ;
                            AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                            tuxIconView.setTuxIcon(c1857680yRS.LIZJ(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), (abstractC1387200mCcLJ2 == null || (activityLIZIZ3 = abstractC1387200mCcLJ2.LIZIZ()) == null) ? false : C960203pA.LIZIZ(activityLIZIZ3)));
                        }
                        C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(this.LIZJ, -2));
                        viewSd.measure(View.MeasureSpec.makeMeasureSpec(this.LIZJ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LIZLLL, Integer.MIN_VALUE));
                        viewSd.layout(0, 0, viewSd.getMeasuredWidth(), viewSd.getMeasuredHeight());
                        Bitmap bitmapLIZ = C19724012Fa.LIZ(viewSd, Bitmap.Config.ARGB_8888);
                        int height = bitmapLIZ != null ? bitmapLIZ.getHeight() : 0;
                        AbstractC1387200mCc abstractC1387200mCcLJ3 = C1906580ziK.LJ();
                        View viewSd2 = C786410Ut5.Sd(R.layout.fq5, C786410Ut5.ne(abstractC1387200mCcLJ3 != null ? abstractC1387200mCcLJ3.LIZIZ() : null), null);
                        C786410Ut5.W5(viewSd2, new ViewGroup.LayoutParams(this.LIZJ, -2));
                        viewSd2.measure(View.MeasureSpec.makeMeasureSpec(this.LIZJ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LIZLLL, Integer.MIN_VALUE));
                        viewSd2.layout(0, 0, viewSd2.getMeasuredWidth(), viewSd2.getMeasuredHeight());
                        Bitmap bitmapLIZ2 = C19724012Fa.LIZ(viewSd2, Bitmap.Config.ARGB_8888);
                        int height2 = bitmapLIZ2 != null ? bitmapLIZ2.getHeight() : 0;
                        int i2 = this.LJFF;
                        int height3 = height + i2 + i2;
                        int i3 = height3 + i2 + height2 + i2;
                        List<Pair<Boolean, Bitmap>> list2 = this.LIZ;
                        int i4 = this.LIZJ;
                        AbstractC1387200mCc abstractC1387200mCcLJ4 = C1906580ziK.LJ();
                        int iLIZJ = i4 - ((int) C12ES.LIZJ(32.0f, abstractC1387200mCcLJ4 != null ? abstractC1387200mCcLJ4.LIZIZ() : null));
                        Iterator<Pair<Boolean, Bitmap>> it2 = list2.iterator();
                        int height4 = 0;
                        while (true) {
                            z = true;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Pair<Boolean, Bitmap> next = it2.next();
                            boolean zBooleanValue = next.getFirst().booleanValue();
                            Bitmap second = next.getSecond();
                            height4 += (!zBooleanValue || second.getWidth() >= i4 || second.getWidth() < iLIZJ) ? second.getHeight() : (int) (second.getHeight() * (i4 / second.getWidth()));
                        }
                        int size = list2.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        int i5 = height4 + (size * this.LJ);
                        int i6 = this.LIZJ;
                        if (i6 < 1) {
                            i6 = 1;
                        }
                        int i7 = i3 + i5;
                        if (i7 < 1) {
                            i7 = 1;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        AbstractC1387200mCc abstractC1387200mCcLJ5 = C1906580ziK.LJ();
                        int iIntValue = (abstractC1387200mCcLJ5 == null || (activityLIZIZ2 = abstractC1387200mCcLJ5.LIZIZ()) == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, activityLIZIZ2)) == null) ? -1 : numLIZJ.intValue();
                        Paint paint = new Paint();
                        paint.setColor(iIntValue);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
                        if (bitmapLIZ != null) {
                            canvas.drawBitmap(bitmapLIZ, (canvas.getWidth() - bitmapLIZ.getWidth()) / 2.0f, i2, (Paint) null);
                        }
                        List<Pair<Boolean, Bitmap>> list3 = this.LIZ;
                        int width = canvas.getWidth();
                        int i8 = this.LIZJ;
                        AbstractC1387200mCc abstractC1387200mCcLJ6 = C1906580ziK.LJ();
                        int iLIZJ2 = i8 - ((int) C12ES.LIZJ(32.0f, abstractC1387200mCcLJ6 != null ? abstractC1387200mCcLJ6.LIZIZ() : null));
                        for (Pair<Boolean, Bitmap> pair : list3) {
                            boolean zBooleanValue2 = pair.getFirst().booleanValue();
                            Bitmap second2 = pair.getSecond();
                            if (!zBooleanValue2 || second2.getWidth() >= width || second2.getWidth() < iLIZJ2) {
                                int width2 = zBooleanValue2 ? 0 : (this.LIZJ - this.LJI) - second2.getWidth();
                                int width3 = canvas.getWidth() - second2.getWidth();
                                if (width3 < 0) {
                                    width3 = 0;
                                }
                                canvas.drawBitmap(second2, C13LZ.LJ(width2, 0, width3), height3, (Paint) null);
                                height3 += second2.getHeight() + this.LJ;
                            } else {
                                int height5 = (int) (second2.getHeight() * (width / second2.getWidth()));
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(second2, width, height5, z);
                                canvas.drawBitmap(bitmapCreateScaledBitmap, 0, height3, (Paint) null);
                                height3 += height5 + this.LJ;
                                if (bitmapCreateScaledBitmap != second2) {
                                    C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                                }
                            }
                            z = true;
                        }
                        if (bitmapLIZ2 != null) {
                            canvas.drawBitmap(bitmapLIZ2, (canvas.getWidth() - bitmapLIZ2.getWidth()) / 2.0f, (i7 - i2) - height2, (Paint) null);
                        }
                        return bitmapCreateBitmap;
                    }

                    {
                        Activity activityLIZIZ2;
                        Activity activityLIZIZ3;
                        Activity activityLIZIZ4;
                        Activity activityLIZIZ5;
                        Activity activityLIZIZ6;
                        this.LIZ = list;
                        this.LIZIZ = interfaceC665370Q7z;
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null) {
                            activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ();
                        } else {
                            activityLIZIZ2 = null;
                        }
                        this.LIZJ = C12ES.LJIIJ(activityLIZIZ2);
                        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ2 != null) {
                            activityLIZIZ3 = abstractC1387200mCcLJ2.LIZIZ();
                        } else {
                            activityLIZIZ3 = null;
                        }
                        this.LIZLLL = C12ES.LJIIIIZZ(activityLIZIZ3);
                        AbstractC1387200mCc abstractC1387200mCcLJ3 = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ3 != null) {
                            activityLIZIZ4 = abstractC1387200mCcLJ3.LIZIZ();
                        } else {
                            activityLIZIZ4 = null;
                        }
                        this.LJ = (int) C12ES.LIZJ(8.0f, activityLIZIZ4);
                        AbstractC1387200mCc abstractC1387200mCcLJ4 = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ4 != null) {
                            activityLIZIZ5 = abstractC1387200mCcLJ4.LIZIZ();
                        } else {
                            activityLIZIZ5 = null;
                        }
                        this.LJFF = (int) C12ES.LIZJ(16.0f, activityLIZIZ5);
                        AbstractC1387200mCc abstractC1387200mCcLJ5 = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ5 != null) {
                            activityLIZIZ6 = abstractC1387200mCcLJ5.LIZIZ();
                        } else {
                            activityLIZIZ6 = null;
                        }
                        this.LJI = (int) C12ES.LIZJ(8.0f, activityLIZIZ6);
                        this.LJII = (ITakoAIBotUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoAIBotUIAbility.class, null);
                    }
                };
                this.LL = 1;
                obj = r2.LIZ();
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.generatorBitmap$1$1");
                    return objLJFF;
                }
            }
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            obj = null;
            if (abstractC1387200mCcLJ != null) {
                activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            C786410Ut5.re(Toast.makeText(activityLIZIZ, "Image generation failed, please select fewer messages", 0));
        }
        this.LLILZ.invoke((Bitmap) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.generatorBitmap$1$1");
        return unit;
    }
}
