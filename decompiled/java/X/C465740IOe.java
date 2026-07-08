package X;

import com.bytedance.android.livesdk.model.Hashtag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C465740IOe extends C2217421BqW implements Function1<Hashtag, Unit> {
    public C465740IOe(Object obj) {
        super(1, obj, C465720IOc.class, "onCheckChanged", "onCheckChanged(Lcom/bytedance/android/livesdk/model/Hashtag;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Hashtag hashtag) {
        Hashtag hashtag2 = hashtag;
        C465720IOc c465720IOc = (C465720IOc) this.receiver;
        c465720IOc.LLILLJJLI = hashtag2;
        c465720IOc.notifyDataSetChanged();
        c465720IOc.LLILLL.invoke(hashtag2);
        return Unit.LIZ;
    }
}
