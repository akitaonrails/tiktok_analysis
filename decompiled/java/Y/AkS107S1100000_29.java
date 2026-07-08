package Y;

import X.AbstractC19484711Kz;
import X.AbstractC19651711ud;
import X.C19651911uf;
import X.C19652211ui;
import X.C196991125l;
import X.C20467080b;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.Status;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AkS107S1100000_29 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS107S1100000_29 akS107S1100000_29, Object obj) {
        AbstractC19651711ud c19651911uf;
        Status status = (Status) obj;
        String str = akS107S1100000_29.s0;
        boolean zLJFF = Intrinsics.LJFF(status.statusCode, CardStruct.IStatusCode.DEFAULT);
        if (!Intrinsics.LJFF(status.statusCode, CardStruct.IStatusCode.DEFAULT)) {
            String str2 = status.statusMessage;
            if (str2 == null || str2.length() == 0) {
                status.statusMessage = C20467080b.LIZIZ(R.string.m25);
            }
            c19651911uf = new C19651911uf(status);
        } else {
            c19651911uf = ((C19652211ui) akS107S1100000_29.l1).LIZJ;
        }
        return new C19652211ui(str, zLJFF, c19651911uf);
    }

    public static final Object apply$1(AkS107S1100000_29 akS107S1100000_29, Object obj) {
        final C196991125l c196991125l = (C196991125l) akS107S1100000_29.l1;
        final String str = akS107S1100000_29.s0;
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.125m
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                List<TextFontStyleData> listLJ;
                TextFontStyleData textFontStyleData;
                C196991125l c196991125l2 = c196991125l;
                String str2 = str;
                C196986125g c196986125g = c196991125l2.LIZ;
                Object obj2 = null;
                if (c196986125g != null && (listLJ = c196986125g.LJ()) != null && !listLJ.isEmpty()) {
                    C196986125g c196986125g2 = c196991125l2.LIZ;
                    if (c196986125g2 != null) {
                        Iterator it2 = ((ArrayList) c196986125g2.LJ()).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (Intrinsics.LJFF(((TextFontStyleData) next).LIZJ.getResource_id(), str2)) {
                                obj2 = next;
                                break;
                            }
                        }
                        TextFontStyleData textFontStyleData2 = (TextFontStyleData) obj2;
                        if (textFontStyleData2 != null) {
                            interfaceC2329309At.onSuccess(textFontStyleData2.LIZ);
                            return;
                        }
                    }
                    C196986125g c196986125g3 = c196991125l2.LIZ;
                    if (c196986125g3 == null || (textFontStyleData = (TextFontStyleData) C13LP.LJJJLL(c196986125g3.LJ())) == null) {
                        return;
                    }
                    interfaceC2329309At.onSuccess(textFontStyleData.LIZ);
                    return;
                }
                interfaceC2329309At.onError(new RuntimeException() { // from class: X.0bOU
                    public static final int $stable = 8;
                });
            }
        });
    }

    public AkS107S1100000_29(String str, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
