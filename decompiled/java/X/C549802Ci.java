package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549802Ci extends Message<C549802Ci, C583502Ph> {
    public static final ProtoAdapter<C549802Ci> ADAPTER = new ProtoAdapter<C549802Ci>() { // from class: X.026W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549802Ci decode(ProtoReader protoReader) {
            C549802Ci c549802Ci = new C549802Ci();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c549802Ci.badge_background_color = C618602bA.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c549802Ci.badge_text = C5431029t.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c549802Ci.coupon_count = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c549802Ci.discount_text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c549802Ci.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549802Ci;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549802Ci c549802Ci) {
            C549802Ci c549802Ci2 = c549802Ci;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c549802Ci2.title) + protoAdapter.encodedSizeWithTag(2, c549802Ci2.discount_text) + ProtoAdapter.INT32.encodedSizeWithTag(3, c549802Ci2.coupon_count) + protoAdapter.encodedSizeWithTag(4, c549802Ci2.badge_text) + C618602bA.ADAPTER.encodedSizeWithTag(5, c549802Ci2.badge_background_color) + c549802Ci2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C549802Ci c549802Ci) {
        }
    };
    public C618602bA badge_background_color;
    public C5431029t badge_text;
    public Integer coupon_count;
    public C5431029t discount_text;
    public C5431029t title;

    public C549802Ci() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C583502Ph newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
