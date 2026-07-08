package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11s3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class DialogC19635711s3 extends C19GU {
    public final long LLILZLL;
    public final C01GW LLIZ;
    public View LLIZLLLIL;
    public C19634911rv LLJ;
    public long LLJI;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r1 >= r0.getHeight()) goto L18;
     */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC19635711s3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vl);
        this.LLIZLLLIL = findViewById(R.id.tqy);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        if (this.LLJI == 0) {
            this.LLJI = System.currentTimeMillis();
        }
        final C19636211s8 c19636211s8 = (C19636211s8) this.LLIZ.getValue();
        if (c19636211s8 != null) {
            long j = this.LLILZLL;
            boolean z = true;
            C786410Ut5.Td(c19636211s8.LLILZIL, R.layout.vk, c19636211s8, true);
            if (c19636211s8.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                C786410Ut5.LJLLLLLL(8, c19636211s8.findViewById(R.id.nga));
                C786410Ut5.LJLLLLLL(0, c19636211s8.findViewById(R.id.ngb));
                c19636211s8.LLILLJJLI = (C19642111t5) c19636211s8.findViewById(R.id.okb);
                c19636211s8.LLILLL = (C19642111t5) c19636211s8.findViewById(R.id.jsu);
                c19636211s8.LLILZ = (C19642111t5) c19636211s8.findViewById(R.id.oh1);
            } else {
                C786410Ut5.LJLLLLLL(0, c19636211s8.findViewById(R.id.nga));
                C786410Ut5.LJLLLLLL(8, c19636211s8.findViewById(R.id.ngb));
                c19636211s8.LLILLJJLI = (C19642111t5) c19636211s8.findViewById(R.id.oka);
                c19636211s8.LLILLL = (C19642111t5) c19636211s8.findViewById(R.id.jst);
                c19636211s8.LLILZ = (C19642111t5) c19636211s8.findViewById(R.id.oh0);
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            c19636211s8.LL = gregorianCalendar;
            gregorianCalendar.setTimeInMillis(j);
            C19642111t5 c19642111t5 = c19636211s8.LLILLJJLI;
            C19642111t5 c19642111t52 = null;
            if (c19642111t5 == null) {
                c19642111t5 = null;
            }
            final Context context = c19636211s8.getContext();
            final Calendar calendar = c19636211s8.LL;
            if (calendar == null) {
                calendar = null;
            }
            c19642111t5.LLJLL = new AbstractC19638411sU(context, calendar) { // from class: X.11s6
                public final Context LIZ;
                public final Calendar LIZIZ;
                public final List<String> LIZJ;

                @Override // X.AbstractC19638411sU
                public final void LIZ() {
                }

                public static final Integer LIZJ() {
                    return 30;
                }

                @Override // X.AbstractC19638411sU
                public final String LIZIZ(int i) {
                    if (i <= 30 && i >= 0) {
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                        gregorianCalendar2.setTimeInMillis(this.LIZIZ.getTimeInMillis());
                        gregorianCalendar2.add(5, i);
                        if (this.LIZIZ.get(1) == gregorianCalendar2.get(1) && this.LIZIZ.get(2) == gregorianCalendar2.get(2) && this.LIZIZ.get(5) == gregorianCalendar2.get(5)) {
                            return this.LIZ.getResources().getString(2131829587);
                        }
                        int i2 = gregorianCalendar2.get(5);
                        if (C1336470ksn.LIZJ(this.LIZ)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(i2);
                            sbLIZ.append(' ');
                            sbLIZ.append((String) ListProtector.get(this.LIZJ, gregorianCalendar2.get(2)));
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((String) ListProtector.get(this.LIZJ, gregorianCalendar2.get(2)));
                        sbLIZ2.append(' ');
                        sbLIZ2.append(i2);
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    return "";
                }

                {
                    this.LIZ = context;
                    this.LIZIZ = calendar;
                    this.LIZJ = C1697810uHb.LJIIJJI(context.getResources().getString(2131829579), context.getResources().getString(2131829578), context.getResources().getString(2131829582), context.getResources().getString(2131829575), context.getResources().getString(2131829583), context.getResources().getString(2131829581), context.getResources().getString(2131829580), context.getResources().getString(2131829576), context.getResources().getString(2131829586), context.getResources().getString(2131829585), context.getResources().getString(2131829584), context.getResources().getString(2131829577));
                }
            };
            c19642111t5.LLILZIL = C19636011s6.LIZJ();
            c19642111t5.LLILZLL = 0;
            c19642111t5.LJ();
            c19642111t5.invalidate();
            C19642111t5 c19642111t53 = c19636211s8.LLILLJJLI;
            if (c19642111t53 == null) {
                c19642111t53 = null;
            }
            c19642111t53.setTextAlign(Paint.Align.CENTER);
            C19642111t5 c19642111t54 = c19636211s8.LLILLJJLI;
            if (c19642111t54 == null) {
                c19642111t54 = null;
            }
            c19642111t54.setMaxWidth((int) ((C11VU.LJ(c19636211s8.getContext()) / 2.0f) - C11VU.LIZIZ(80.0f, c19636211s8.getContext())));
            C19642111t5 c19642111t55 = c19636211s8.LLILLL;
            if (c19642111t55 == null) {
                c19642111t55 = null;
            }
            c19642111t55.setTextAlign(Paint.Align.LEFT);
            C19642111t5 c19642111t56 = c19636211s8.LLILZ;
            if (c19642111t56 == null) {
                c19642111t56 = null;
            }
            c19642111t56.setTextAlign(Paint.Align.LEFT);
            C19642111t5 c19642111t57 = c19636211s8.LLILLJJLI;
            if (c19642111t57 == null) {
                c19642111t57 = null;
            }
            C19636211s8.LIZ(30, c19642111t57);
            C19642111t5 c19642111t58 = c19636211s8.LLILLL;
            if (c19642111t58 == null) {
                c19642111t58 = null;
            }
            C19636211s8.LIZ(23, c19642111t58);
            C19642111t5 c19642111t59 = c19636211s8.LLILZ;
            if (c19642111t59 == null) {
                c19642111t59 = null;
            }
            C19636211s8.LIZ(59, c19642111t59);
            C19642111t5 c19642111t510 = c19636211s8.LLILLJJLI;
            if (c19642111t510 == null) {
                c19642111t510 = null;
            }
            c19642111t510.setOnValueChangedListener(new InterfaceC19638511sV() { // from class: X.11s7
                @Override // X.InterfaceC19638511sV
                public final void LIZ() {
                    C19637311sJ c19637311sJ;
                    c19636211s8.LIZIZ();
                    C19636211s8 c19636211s82 = c19636211s8;
                    C19642111t5 c19642111t511 = c19636211s82.LLILLJJLI;
                    if (c19642111t511 == null) {
                        c19642111t511 = null;
                    }
                    int currentPosition = c19642111t511.getCurrentPosition();
                    C19642111t5 c19642111t512 = c19636211s8.LLILLL;
                    if (c19642111t512 == null) {
                        c19642111t512 = null;
                    }
                    int currentPosition2 = c19642111t512.getCurrentPosition();
                    C19642111t5 c19642111t513 = c19636211s8.LLILZ;
                    int currentPosition3 = (c19642111t513 != null ? c19642111t513 : null).getCurrentPosition();
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                    gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
                    float f = (((((currentPosition * 24.0f) * 60.0f) * 60.0f) + ((currentPosition2 * 60.0f) * 60.0f)) + (currentPosition3 * 60.0f)) - ((((gregorianCalendar2.get(11) * 60.0f) * 60.0f) + (gregorianCalendar2.get(12) * 60.0f)) + gregorianCalendar2.get(13));
                    if (f > 0.0f) {
                        int i = (int) (f / 86400.0f);
                        float f2 = (int) (f - (((i * 24.0f) * 60.0f) * 60.0f));
                        int i2 = (int) (f2 / 3600.0f);
                        float f3 = (int) (f2 - ((i2 * 60.0f) * 60.0f));
                        int i3 = (int) (f3 / 60.0f);
                        int i4 = (int) (f3 - (i3 * 60.0f));
                        GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                        gregorianCalendar3.setTimeInMillis(gregorianCalendar2.getTimeInMillis());
                        gregorianCalendar3.add(5, i);
                        gregorianCalendar3.add(11, i2);
                        gregorianCalendar3.add(12, i3);
                        gregorianCalendar3.add(13, i4);
                        c19637311sJ = new C19637311sJ(String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4), C19636311s9.LIZIZ(gregorianCalendar3.getTimeInMillis()));
                    } else {
                        c19637311sJ = new C19637311sJ(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, C19636311s9.LIZIZ(gregorianCalendar2.getTimeInMillis()));
                    }
                    InterfaceC19638311sT interfaceC19638311sT = c19636211s82.LLILZLL;
                    if (interfaceC19638311sT != null) {
                        interfaceC19638311sT.LIZ(c19637311sJ.LJ);
                    }
                }
            });
            C19642111t5 c19642111t511 = c19636211s8.LLILLL;
            if (c19642111t511 == null) {
                c19642111t511 = null;
            }
            c19642111t511.setOnValueChangedListener(new InterfaceC19638511sV() { // from class: X.11s7
                @Override // X.InterfaceC19638511sV
                public final void LIZ() {
                    C19637311sJ c19637311sJ;
                    c19636211s8.LIZIZ();
                    C19636211s8 c19636211s82 = c19636211s8;
                    C19642111t5 c19642111t5112 = c19636211s82.LLILLJJLI;
                    if (c19642111t5112 == null) {
                        c19642111t5112 = null;
                    }
                    int currentPosition = c19642111t5112.getCurrentPosition();
                    C19642111t5 c19642111t512 = c19636211s8.LLILLL;
                    if (c19642111t512 == null) {
                        c19642111t512 = null;
                    }
                    int currentPosition2 = c19642111t512.getCurrentPosition();
                    C19642111t5 c19642111t513 = c19636211s8.LLILZ;
                    int currentPosition3 = (c19642111t513 != null ? c19642111t513 : null).getCurrentPosition();
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                    gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
                    float f = (((((currentPosition * 24.0f) * 60.0f) * 60.0f) + ((currentPosition2 * 60.0f) * 60.0f)) + (currentPosition3 * 60.0f)) - ((((gregorianCalendar2.get(11) * 60.0f) * 60.0f) + (gregorianCalendar2.get(12) * 60.0f)) + gregorianCalendar2.get(13));
                    if (f > 0.0f) {
                        int i = (int) (f / 86400.0f);
                        float f2 = (int) (f - (((i * 24.0f) * 60.0f) * 60.0f));
                        int i2 = (int) (f2 / 3600.0f);
                        float f3 = (int) (f2 - ((i2 * 60.0f) * 60.0f));
                        int i3 = (int) (f3 / 60.0f);
                        int i4 = (int) (f3 - (i3 * 60.0f));
                        GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                        gregorianCalendar3.setTimeInMillis(gregorianCalendar2.getTimeInMillis());
                        gregorianCalendar3.add(5, i);
                        gregorianCalendar3.add(11, i2);
                        gregorianCalendar3.add(12, i3);
                        gregorianCalendar3.add(13, i4);
                        c19637311sJ = new C19637311sJ(String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4), C19636311s9.LIZIZ(gregorianCalendar3.getTimeInMillis()));
                    } else {
                        c19637311sJ = new C19637311sJ(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, C19636311s9.LIZIZ(gregorianCalendar2.getTimeInMillis()));
                    }
                    InterfaceC19638311sT interfaceC19638311sT = c19636211s82.LLILZLL;
                    if (interfaceC19638311sT != null) {
                        interfaceC19638311sT.LIZ(c19637311sJ.LJ);
                    }
                }
            });
            C19642111t5 c19642111t512 = c19636211s8.LLILZ;
            if (c19642111t512 != null) {
                c19642111t52 = c19642111t512;
            }
            c19642111t52.setOnValueChangedListener(new InterfaceC19638511sV() { // from class: X.11s7
                @Override // X.InterfaceC19638511sV
                public final void LIZ() {
                    C19637311sJ c19637311sJ;
                    c19636211s8.LIZIZ();
                    C19636211s8 c19636211s82 = c19636211s8;
                    C19642111t5 c19642111t5112 = c19636211s82.LLILLJJLI;
                    if (c19642111t5112 == null) {
                        c19642111t5112 = null;
                    }
                    int currentPosition = c19642111t5112.getCurrentPosition();
                    C19642111t5 c19642111t5122 = c19636211s8.LLILLL;
                    if (c19642111t5122 == null) {
                        c19642111t5122 = null;
                    }
                    int currentPosition2 = c19642111t5122.getCurrentPosition();
                    C19642111t5 c19642111t513 = c19636211s8.LLILZ;
                    int currentPosition3 = (c19642111t513 != null ? c19642111t513 : null).getCurrentPosition();
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                    gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
                    float f = (((((currentPosition * 24.0f) * 60.0f) * 60.0f) + ((currentPosition2 * 60.0f) * 60.0f)) + (currentPosition3 * 60.0f)) - ((((gregorianCalendar2.get(11) * 60.0f) * 60.0f) + (gregorianCalendar2.get(12) * 60.0f)) + gregorianCalendar2.get(13));
                    if (f > 0.0f) {
                        int i = (int) (f / 86400.0f);
                        float f2 = (int) (f - (((i * 24.0f) * 60.0f) * 60.0f));
                        int i2 = (int) (f2 / 3600.0f);
                        float f3 = (int) (f2 - ((i2 * 60.0f) * 60.0f));
                        int i3 = (int) (f3 / 60.0f);
                        int i4 = (int) (f3 - (i3 * 60.0f));
                        GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                        gregorianCalendar3.setTimeInMillis(gregorianCalendar2.getTimeInMillis());
                        gregorianCalendar3.add(5, i);
                        gregorianCalendar3.add(11, i2);
                        gregorianCalendar3.add(12, i3);
                        gregorianCalendar3.add(13, i4);
                        c19637311sJ = new C19637311sJ(String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4), C19636311s9.LIZIZ(gregorianCalendar3.getTimeInMillis()));
                    } else {
                        c19637311sJ = new C19637311sJ(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, C19636311s9.LIZIZ(gregorianCalendar2.getTimeInMillis()));
                    }
                    InterfaceC19638311sT interfaceC19638311sT = c19636211s82.LLILZLL;
                    if (interfaceC19638311sT != null) {
                        interfaceC19638311sT.LIZ(c19637311sJ.LJ);
                    }
                }
            });
        }
        C19636211s8 c19636211s82 = (C19636211s8) this.LLIZ.getValue();
        if (c19636211s82 != null) {
            c19636211s82.setSelectTimeMiles(this.LLJI);
        }
    }

    public DialogC19635711s3(long j, Context context) {
        super(context, R.style.hg);
        this.LLILZLL = j;
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 778));
    }
}
