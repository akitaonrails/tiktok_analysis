package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556702Ez extends Message<C556702Ez, C02L2> {
    public static final ProtoAdapter<C556702Ez> ADAPTER = new ProtoAdapter<C556702Ez>() { // from class: X.029G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556702Ez decode(ProtoReader protoReader) {
            C556702Ez c556702Ez = new C556702Ez();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c556702Ez.share_toast = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c556702Ez.shop_toast = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c556702Ez.original_list = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c556702Ez.follow_toast = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556702Ez;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556702Ez c556702Ez) {
            C556702Ez c556702Ez2 = c556702Ez;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c556702Ez2.follow_toast) + protoAdapter.encodedSizeWithTag(2, c556702Ez2.original_list) + protoAdapter.encodedSizeWithTag(3, c556702Ez2.shop_toast) + protoAdapter.encodedSizeWithTag(4, c556702Ez2.share_toast) + c556702Ez2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556702Ez c556702Ez) {
            C556702Ez c556702Ez2 = c556702Ez;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c556702Ez2.follow_toast);
            protoAdapter.encodeWithTag(protoWriter, 2, c556702Ez2.original_list);
            protoAdapter.encodeWithTag(protoWriter, 3, c556702Ez2.shop_toast);
            protoAdapter.encodeWithTag(protoWriter, 4, c556702Ez2.share_toast);
            protoWriter.writeBytes(c556702Ez2.unknownFields());
        }
    };
    public Integer follow_toast;
    public Integer original_list;
    public Integer share_toast;
    public Integer shop_toast;

    public C556702Ez() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02L2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
